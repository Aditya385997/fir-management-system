package com.policesystem.firmanagement.serviceImpl;

import com.policesystem.firmanagement.model.Fir;
import com.policesystem.firmanagement.repo.FirDetails;
import com.policesystem.firmanagement.service.FirService;
import org.springframework.stereotype.Service;

@Service
public class FirServiceImpl implements FirService{
    private FirDetails firDetails;
    @Override
    public Fir insertComplaint(Fir fir) {
        try
        {
            Fir fir1 = new Fir();

            return null;

        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }

    }
}
