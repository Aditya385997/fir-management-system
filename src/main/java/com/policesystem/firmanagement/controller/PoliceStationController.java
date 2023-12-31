package com.policesystem.firmanagement.controller;

import com.policesystem.firmanagement.model.PoliceStation;
import com.policesystem.firmanagement.payload.PoliceStationReqBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/v1/policeStation")
public interface PoliceStationController {
    @PostMapping("/add")
    ResponseEntity<PoliceStation> insertPoliceStation(PoliceStationReqBody policeStationReqBody);
}
