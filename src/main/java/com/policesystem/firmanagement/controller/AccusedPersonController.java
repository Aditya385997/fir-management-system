package com.policesystem.firmanagement.controller;

import com.policesystem.firmanagement.model.AccusedPerson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/accusedPerson")
public interface AccusedPersonController {
    @PostMapping("/add")
    ResponseEntity<AccusedPerson> insertAccusedPerson(AccusedPerson accusedPerson);
}
