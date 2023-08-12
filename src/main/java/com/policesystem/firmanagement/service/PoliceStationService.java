package com.policesystem.firmanagement.service;

import com.policesystem.firmanagement.model.PoliceStation;
import com.policesystem.firmanagement.payload.PoliceStationReqBody;

public interface PoliceStationService {
    PoliceStation insertPoliceStation(PoliceStationReqBody policeStationReqBody);
    PoliceStation getPoliceStationName(Long id);
}
