package com.policesystem.firmanagement.controller;

import com.policesystem.firmanagement.model.PoliceOfficer;
import com.policesystem.firmanagement.payload.PoliceOfficerReqBody;
import com.policesystem.firmanagement.response.PolicesFromStationId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/v1/policeOfficer")
public interface PoliceOfficerController {

    @PostMapping("/add")
    ResponseEntity<PoliceOfficer> insertOfficer(PoliceOfficerReqBody policeOfficerReqBody);

    @GetMapping("getAll/station_id/{id}")
    ResponseEntity<List<PolicesFromStationId>> getPoliceOfficerFromStaionId(Long id);


}
