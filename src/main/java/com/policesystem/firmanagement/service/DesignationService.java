package com.policesystem.firmanagement.service;


import com.policesystem.firmanagement.model.Designation;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DesignationService {
     void insertDesignation(Designation designation);
     List<Designation> getAll();
}
