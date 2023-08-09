package com.policesystem.firmanagement.serviceImpl;

import com.policesystem.firmanagement.model.AccusedPerson;
import com.policesystem.firmanagement.repo.AccusedPersonDetail;
import com.policesystem.firmanagement.service.AccusedPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccusedPersonServiceImpl implements AccusedPersonService {
    @Autowired
    private AccusedPersonDetail accusedPersonDetail;

    @Override
    public AccusedPerson insertPerson(AccusedPerson accusedPerson) {
        try
        {
            accusedPersonDetail.save(accusedPerson);
            return accusedPerson;
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}