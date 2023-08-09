package com.policesystem.firmanagement.repo;

import com.policesystem.firmanagement.model.AccusedPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccusedPersonDetail extends JpaRepository<AccusedPerson,Long> {

}
