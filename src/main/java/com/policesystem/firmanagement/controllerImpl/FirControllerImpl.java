package com.policesystem.firmanagement.controllerImpl;

import com.policesystem.firmanagement.controller.FirController;
import com.policesystem.firmanagement.model.Fir;
import com.policesystem.firmanagement.payload.FirReqBody;
import com.policesystem.firmanagement.service.FirService;
import com.policesystem.firmanagement.utils.ResponseEntityConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirControllerImpl implements FirController {

    @Autowired
    private FirService firService;

    /*
    * Always Remember While Data Entering to databas using hibernate We Have To Set All The attributes of class as it is
    * Also Child Class Should be save first than parent if we are doing manually
    * */
    @Override
    public ResponseEntity<Fir> insertComplain(@RequestBody FirReqBody firReqBody) {
        try{

            Fir fir1 = firService.insertComplaint(firReqBody);
            return new ResponseEntity<Fir>(fir1,HttpStatusCode.valueOf(ResponseEntityConst.SUCESS));
        }catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatusCode.valueOf(ResponseEntityConst.UNSUCCESSFUL));
        }
    }

    @Override
    public ResponseEntity<List<Fir>> getFirByPoliceStationId(@PathVariable Long id) {
        try
        {
            System.out.println(id);
            List<Fir> firs = firService.getFirsByStation_id(id);
            return new ResponseEntity<List<Fir>>(firs,HttpStatus.OK);
        }catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity<List<Fir>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
