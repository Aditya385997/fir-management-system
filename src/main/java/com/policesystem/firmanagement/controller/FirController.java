package com.policesystem.firmanagement.controller;

import com.policesystem.firmanagement.model.Fir;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/fir")
public interface FirController {
    @PostMapping("/add")
    ResponseEntity<Fir> insertComplain(@RequestBody Fir fir);
}
