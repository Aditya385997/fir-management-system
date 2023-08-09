package com.policesystem.firmanagement.controllerImpl;

import com.policesystem.firmanagement.controller.FirController;
import com.policesystem.firmanagement.model.Fir;
import com.policesystem.firmanagement.service.FirService;
import com.policesystem.firmanagement.utils.ResponseEntityConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirControllerImpl implements FirController {

    @Autowired
    private FirService firService;
    @Override
    public ResponseEntity<Fir> insertComplain(@RequestBody Fir fir) {
        try{
            Fir fir1 = firService.insertComplaint(fir);
            return new ResponseEntity<Fir>(fir1,HttpStatusCode.valueOf(ResponseEntityConst.SUCESS));
        }catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatusCode.valueOf(ResponseEntityConst.UNSUCCESSFUL));
        }
    }
}
