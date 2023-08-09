package com.policesystem.firmanagement.controller;

import com.policesystem.firmanagement.model.Designation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/api/v1/designation")
public interface DesignationController {

    @PostMapping("/insertRole")
    ResponseEntity<Designation> insertRole(Designation designation);

    //This Api is For Frontend to use the Drop box ui
    @GetMapping("/getAll")
    ResponseEntity<List<Designation>> getAll();

}
