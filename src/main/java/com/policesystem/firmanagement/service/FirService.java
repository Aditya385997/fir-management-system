package com.policesystem.firmanagement.service;

import com.policesystem.firmanagement.model.Fir;
import com.policesystem.firmanagement.payload.FirReqBody;

import java.util.List;

public interface FirService {

    Fir insertComplaint(FirReqBody firReqBody);

    List<Fir> getFirsByStation_id(Long id);

}
