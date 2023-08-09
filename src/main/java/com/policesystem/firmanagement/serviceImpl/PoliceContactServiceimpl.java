package com.policesystem.firmanagement.serviceImpl;

import com.policesystem.firmanagement.model.ContactNumber;
import com.policesystem.firmanagement.repo.PolicePhoneNumber;
import com.policesystem.firmanagement.service.PoliceContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoliceContactServiceimpl implements PoliceContactService {

    @Autowired
    private PolicePhoneNumber policePhoneNumber;

    @Override
    public void addNumber(ContactNumber contactNumber) {
        try
        {
            policePhoneNumber.save(contactNumber);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
