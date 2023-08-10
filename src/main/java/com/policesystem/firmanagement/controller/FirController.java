package com.policesystem.firmanagement.controller;

import com.policesystem.firmanagement.model.Fir;
import com.policesystem.firmanagement.payload.FirReqBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/fir")
public interface FirController {
    @PostMapping("/add")
    ResponseEntity<Fir> insertComplain(@RequestBody FirReqBody firReqBody);
}
