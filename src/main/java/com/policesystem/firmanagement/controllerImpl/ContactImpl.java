package com.policesystem.firmanagement.controllerImpl;

import com.policesystem.firmanagement.controller.ContactController;
import com.policesystem.firmanagement.model.ContactNumber;
import com.policesystem.firmanagement.service.PoliceContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactImpl implements ContactController {
    @Autowired
    private PoliceContactService policeContactService;

    @Override
    public ResponseEntity<ContactNumber> addContact(@RequestBody ContactNumber contactNumber) {
        try{
            policeContactService.addNumber(contactNumber);
            return new ResponseEntity<ContactNumber>(contactNumber, HttpStatusCode.valueOf(200));
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<ContactNumber>(contactNumber,HttpStatusCode.valueOf(500));
        }
    }
}
