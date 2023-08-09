package com.policesystem.firmanagement.controllerImpl;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.policesystem.firmanagement.controller.DesignationController;
import com.policesystem.firmanagement.model.Designation;
import com.policesystem.firmanagement.service.DesignationService;
import com.policesystem.firmanagement.utils.ResponseEntityConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DesignationImpl implements DesignationController {

    @Autowired
    private DesignationService designationService;

    @Override
    public ResponseEntity<Designation> insertRole(@RequestBody Designation designation) {
        try{
            designationService.insertDesignation(designation);
            return new ResponseEntity<Designation>(designation,HttpStatusCode.valueOf(ResponseEntityConst.SUCESS));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<Designation>(designation, HttpStatusCode.valueOf(ResponseEntityConst.UNSUCCESSFUL));
        }
    }

    @Override
    public ResponseEntity<List<Designation>> getAll(){
        try
        {
            List<Designation> roles = designationService.getAll();
            return new ResponseEntity<List<Designation>>(roles,HttpStatusCode.valueOf(ResponseEntityConst.SUCESS));
        }catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<List<Designation>>(HttpStatusCode.valueOf(ResponseEntityConst.UNSUCCESSFUL));
        }
    }
}
