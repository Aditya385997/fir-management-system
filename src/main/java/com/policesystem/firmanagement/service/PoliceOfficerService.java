package com.policesystem.firmanagement.service;

import com.policesystem.firmanagement.model.PoliceOfficer;
import com.policesystem.firmanagement.payload.PoliceOfficerReqBody;
import com.policesystem.firmanagement.response.PolicesFromStationId;

import java.util.List;

public interface PoliceOfficerService{
    PoliceOfficer insertPoliceOfficer(PoliceOfficerReqBody policeOfficerReqBody);
    List<PolicesFromStationId> getAllOfficer(Long id);
}
