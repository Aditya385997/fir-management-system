package com.policesystem.firmanagement.serviceImpl;

import com.policesystem.firmanagement.model.*;
import com.policesystem.firmanagement.payload.FirReqBody;
import com.policesystem.firmanagement.repo.FirDetails;
import com.policesystem.firmanagement.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FirServiceImpl implements FirService{

    @Autowired
    private static  AccusedPersonService accusedPersonService;
    @Autowired
    private static PoliceContactService policeContactService;

    private final FirDetails firDetails;


    private final PoliceOfficerService policeOfficerService;


    private final PoliceStationService policeStationService;

    @Autowired
    public FirServiceImpl(AccusedPersonService accusedPersonService, FirDetails firDetails, PoliceOfficerService policeOfficerService, PoliceStationService policeStationService) {
        FirServiceImpl.accusedPersonService = accusedPersonService;
        this.firDetails = firDetails;
        this.policeOfficerService = policeOfficerService;
        this.policeStationService = policeStationService;
    }

        @Override
        public Fir insertComplaint(FirReqBody firReqBody) {
            try
            {
                String po = firReqBody.getPoliceOfficerId();
                Long po_id = Long.parseLong(po);
                String temp = firReqBody.getPoliceStationId();
                long id = Long.parseLong(temp);
                PoliceStation policeStation=policeStationService.getPoliceStationName(id);
                PoliceOfficer policeOfficer = policeOfficerService.getPoliceById(po_id);

                Fir fir1 = getFir(firReqBody, policeStation,policeOfficer);
                assert fir1 != null;
                firDetails.save(fir1);
                return fir1;

            }catch (Exception e)
            {
                e.printStackTrace();
                return null;
            }

        }

    @Override
    public List<Fir> getFirsByStation_id(Long id)
    {
        try
        {
            List<Fir>firs = firDetails.getFirsBySt_id(id);
            System.out.println(firs);
            return firs;
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }


    private static Fir getFir(FirReqBody firReqBody, PoliceStation policeStation,PoliceOfficer policeOfficer) {
            try{

                List<AccusedPerson> accusedPeoples = new ArrayList<>();
                List<PoliceOfficer> policeOfficers = new ArrayList<>();
                List<ContactNumber> accused_contacts = new ArrayList<>();

                policeOfficers.add(policeOfficer);

                for(AccusedPerson accusedPerson : firReqBody.getAccusedPeople())
                {

                    List<ContactNumber> contactNumbers;
                    AccusedPerson accusedPerson1 = new AccusedPerson();
                    accusedPerson1.setAcc_name(accusedPerson.getAcc_name());
                    accusedPerson1.setAcc_age(accusedPerson.getAcc_age());
                    //This is the Manual Way Where Cascading is not used
                    accusedPersonService.insertPerson(accusedPerson1);
                    contactNumbers = accusedPerson.getContactNumbers();
                    for(ContactNumber contactNumber:contactNumbers)
                    {
                        ContactNumber contactNumber1 = new ContactNumber();
                        contactNumber1.setPh_no(contactNumber.getPh_no());
                        contactNumber1.setAccusedPerson(accusedPerson1);
                        accused_contacts.add(contactNumber1);
                    }
                    accusedPerson1.setContactNumbers(accused_contacts);
                    accusedPeoples.add(accusedPerson1);
                }

                //If we Set All the Attributes As per the class the data Will Automatically stored in different Tables with the help of cascading
                Fir fir1 = new Fir();
                fir1.setCrimeDetails(firReqBody.getCriminalDetail());
                fir1.setIssue_person(firReqBody.getIssuedPerson());
                fir1.setPolice_station(policeStation);
                fir1.setAccusedPeoples(accusedPeoples);
                fir1.setPoliceOfficers(policeOfficers);
                return fir1;
            }catch (Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
}
