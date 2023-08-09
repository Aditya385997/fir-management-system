package com.policesystem.firmanagement.serviceImpl;
import com.policesystem.firmanagement.model.ContactNumber;
import com.policesystem.firmanagement.model.Designation;
import com.policesystem.firmanagement.model.PoliceOfficer;
import com.policesystem.firmanagement.model.PoliceStation;
import com.policesystem.firmanagement.payload.PoliceOfficerReqBody;
import com.policesystem.firmanagement.repo.PoliceStationRepository;
import com.policesystem.firmanagement.repo.Policeman;
import com.policesystem.firmanagement.repo.Post;
import com.policesystem.firmanagement.response.PolicesFromStationId;
import com.policesystem.firmanagement.service.PoliceOfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PoliceOfficerServiceImpl implements PoliceOfficerService {

    /*
    * I have left incomplete Wanted to think pn api to how to store data in both table;
    *
    *
    * */
    private final Policeman policeman;
    private final Post post;

    private final PoliceStationRepository policeStationRepository;

    @Autowired
    public PoliceOfficerServiceImpl(Policeman policeman,Post post,PoliceStationRepository policeStationRepository)
    {
        this.policeman = policeman;
        this.post = post;
        this.policeStationRepository = policeStationRepository;
    }

    @Override
    public PoliceOfficer insertPoliceOfficer(PoliceOfficerReqBody policeOfficerReqBody) {
        try {
            long id;
            String temp,st_id;

            PoliceOfficer policeOfficer = new PoliceOfficer();
            policeOfficer.setName(policeOfficerReqBody.getReq_name());
            policeOfficer.setAge(policeOfficerReqBody.getReq_age());
            temp = policeOfficerReqBody.getDesignation();
            st_id = policeOfficerReqBody.getReq_station_id();
            PoliceStation policeStation = policeStationRepository.getReferenceById(Long.parseLong(st_id));
            policeOfficer.setPoliceStation(policeStation);
            id = Long.parseLong(temp);
            Designation designation = post.getReferenceById(id);
            policeOfficer.setDesignation(designation);
            List<ContactNumber> contacts = new ArrayList<>();

            for(ContactNumber contactNumber : policeOfficerReqBody.getReq_contactNumbers())
            {
                ContactNumber contactNumber1 = new ContactNumber();
                contactNumber1.setPh_no(contactNumber.getPh_no());
                contactNumber1.setPoliceOfficer(policeOfficer);
                contacts.add(contactNumber1);
            }
            policeOfficer.setContactNumberList(contacts);


            policeman.save(policeOfficer);
            return policeOfficer;


        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<PolicesFromStationId> getAllOfficer(Long id) {
        try {
         List<PolicesFromStationId>  polices = policeman.getAllOfficers(id);
         return polices;
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }

    }


}
