package com.policesystem.firmanagement.repo;

import com.policesystem.firmanagement.model.Fir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FirDetails extends JpaRepository<Fir,Long> {

        @Query("SELECT f from Fir as f JOIN f.police_station as ps where ps.id = :station_id")
        List<Fir> getFirsBySt_id(@Param("station_id") Long station_id);
}
