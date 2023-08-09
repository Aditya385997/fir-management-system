package com.policesystem.firmanagement.repo;

import com.policesystem.firmanagement.model.Fir;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirDetails extends JpaRepository<Fir,Long> {
}
