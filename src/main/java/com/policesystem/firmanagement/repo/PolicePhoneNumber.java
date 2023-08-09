package com.policesystem.firmanagement.repo;

import com.policesystem.firmanagement.model.ContactNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface PolicePhoneNumber extends JpaRepository<ContactNumber,Long> {
}
