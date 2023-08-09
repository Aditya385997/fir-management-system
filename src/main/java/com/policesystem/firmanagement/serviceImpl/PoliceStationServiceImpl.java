package com.policesystem.firmanagement.serviceImpl;

import com.policesystem.firmanagement.model.ContactNumber;
import com.policesystem.firmanagement.model.PoliceStation;
import com.policesystem.firmanagement.repo.PoliceStationRepository;
import com.policesystem.firmanagement.service.PoliceContactService;
import com.policesystem.firmanagement.service.PoliceStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoliceStationServiceImpl implements PoliceStationService {
    @Autowired
    private PoliceStationRepository policeStationRepository;
    @Override
    public void insertPoliceStation(PoliceStation policeStation) {
        try {
            policeStationRepository.save(policeStation);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}