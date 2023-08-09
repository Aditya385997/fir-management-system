package com.policesystem.firmanagement.controllerImpl;

import com.policesystem.firmanagement.controller.AccusedPersonController;
import com.policesystem.firmanagement.model.AccusedPerson;
import com.policesystem.firmanagement.service.AccusedPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccusedControllerImpl implements AccusedPersonController {

    @Autowired
    private AccusedPersonService accusedPersonService;
    @Override
    public ResponseEntity<AccusedPerson> insertAccusedPerson(AccusedPerson accusedPerson) {
        try
        {


        }
        catch (Exception e)
        {

        }
        return null;
    }
}
