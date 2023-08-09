package com.policesystem.firmanagement.controllerImpl;

import com.policesystem.firmanagement.controller.PoliceStationController;
import com.policesystem.firmanagement.model.PoliceOfficer;
import com.policesystem.firmanagement.model.PoliceStation;
import com.policesystem.firmanagement.service.PoliceStationService;
import com.policesystem.firmanagement.utils.ResponseEntityConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoliceStationControllerImpl implements PoliceStationController {
    @Autowired
    private PoliceStationService policeStationService;
    @Override
    public ResponseEntity<PoliceStation> insertPoliceStation(@RequestBody PoliceStation policeStation) {
        try {
            policeStationService.insertPoliceStation(policeStation);
            return new ResponseEntity<PoliceStation>(policeStation, HttpStatusCode.valueOf(ResponseEntityConst.SUCESS));
        }catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<PoliceStation>(policeStation, HttpStatusCode.valueOf(ResponseEntityConst.UNSUCCESSFUL));
        }
    }

}
