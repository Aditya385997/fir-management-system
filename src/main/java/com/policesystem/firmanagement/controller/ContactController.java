package com.policesystem.firmanagement.controller;

import com.policesystem.firmanagement.model.ContactNumber;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/contacts")
public interface ContactController {
    ResponseEntity<ContactNumber> addContact(ContactNumber contactNumber);
}
