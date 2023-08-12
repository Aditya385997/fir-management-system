package com.policesystem.firmanagement.controllerImpl;

import com.policesystem.firmanagement.controller.PoliceOfficerController;
import com.policesystem.firmanagement.model.PoliceOfficer;
import com.policesystem.firmanagement.payload.PoliceOfficerReqBody;
import com.policesystem.firmanagement.response.PolicesFromStationId;
import com.policesystem.firmanagement.service.PoliceOfficerService;
import com.policesystem.firmanagement.utils.ResponseEntityConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PoliceOfficerControllerImpl implements PoliceOfficerController {

    private final PoliceOfficerService policeOfficerService;
    @Autowired
    public PoliceOfficerControllerImpl(PoliceOfficerService policeOfficerService) {
        this.policeOfficerService = policeOfficerService;
    }

    @Override
    public ResponseEntity<PoliceOfficer> insertOfficer(@RequestBody PoliceOfficerReqBody policeOfficerReqBody) {
        try{
            System.out.println(policeOfficerReqBody);
            PoliceOfficer policeOfficer = policeOfficerService.insertPoliceOfficer(policeOfficerReqBody);
            System.out.println(policeOfficer);
            return new ResponseEntity<>(policeOfficer, HttpStatusCode.valueOf(ResponseEntityConst.SUCESS));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<PoliceOfficer>(HttpStatusCode.valueOf(ResponseEntityConst.UNSUCCESSFUL));
        }
    }

    @Override
    public ResponseEntity<List<PolicesFromStationId>> getPoliceOfficerFromStaionId(@PathVariable Long id)
    {
        try
        {
            List<PolicesFromStationId> polices = policeOfficerService.getAllOfficer(id);
            return new ResponseEntity<>(polices, HttpStatusCode.valueOf(ResponseEntityConst.SUCESS));

        }catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<List<PolicesFromStationId>>(HttpStatusCode.valueOf(ResponseEntityConst.UNSUCCESSFUL));
        }
    }
}










/*
* During This the New Police Officer is Assigned Will get the Dropbox Feature in Frontend which will be selected During the Policeman Registering in the app
*
* */