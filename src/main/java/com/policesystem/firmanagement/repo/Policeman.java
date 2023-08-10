package com.policesystem.firmanagement.repo;

import com.policesystem.firmanagement.model.PoliceOfficer;
import com.policesystem.firmanagement.response.PolicesFromStationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface Policeman extends JpaRepository<PoliceOfficer,Long> {
    //while using join we used the class having foriegn key and the field
    // /*po is policeofficer entity class and police station is the foriegn key attribute */

    //Also Remember U get data With respect to table;
    @Query("Select NEW com.policesystem.firmanagement.response.PolicesFromStationId(po.name,po.age,ps.station_name,d.role) FROM PoliceOfficer as po INNER JOIN po.policeStation as ps INNER JOIN po.designation as d WHERE ps.id = :id")
    List<PolicesFromStationId> getAllOfficers(@Param("id") Long  id);



    @Query("Select po From PoliceOfficer as po WHERE po.policeStation = :id")
    List<PoliceOfficer> getPoliceByStationId(@Param("id") Long id);

}
