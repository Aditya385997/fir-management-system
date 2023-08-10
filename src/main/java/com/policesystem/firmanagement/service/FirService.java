package com.policesystem.firmanagement.service;

import com.policesystem.firmanagement.model.Fir;
import com.policesystem.firmanagement.payload.FirReqBody;

public interface FirService {

    Fir insertComplaint(FirReqBody firReqBody);

}
