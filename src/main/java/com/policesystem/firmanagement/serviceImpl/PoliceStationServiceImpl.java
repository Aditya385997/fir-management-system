package com.policesystem.firmanagement.serviceImpl;


import com.policesystem.firmanagement.model.Address;
import com.policesystem.firmanagement.model.PoliceStation;
import com.policesystem.firmanagement.payload.PoliceStationReqBody;
import com.policesystem.firmanagement.repo.PoliceStationRepository;
import com.policesystem.firmanagement.service.PoliceStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoliceStationServiceImpl implements PoliceStationService {
    @Autowired
    private PoliceStationRepository policeStationRepository;

    @Override
    public PoliceStation insertPoliceStation(PoliceStationReqBody policeStationReqBody) {
        try
        {

            PoliceStation policeStation = new PoliceStation();
            policeStation.setStation_name(policeStationReqBody.getReq_station_name());

            Address address = new Address();
            address.setFullAddress(policeStationReqBody.getAddress().getFullAddress());
            address.setPostalCode(policeStationReqBody.getAddress().getPostalCode());
            address.setCity(policeStationReqBody.getAddress().getCity());
            address.setState(policeStationReqBody.getAddress().getState());
            address.setCountry(policeStationReqBody.getAddress().getCountry());

            policeStation.setAddress(address);

            policeStationRepository.save(policeStation);
            return policeStation;


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public PoliceStation getPoliceStationName(Long id) {
        try {
            return policeStationRepository.getReferenceById(id);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

