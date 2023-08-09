package com.policesystem.firmanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "police_station")
public class PoliceStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "police_station_id")
    private int id;

    @Column(name = "police_station_name",nullable = false)
    private String station_name;

    @OneToMany(mappedBy = "policeStation",cascade = CascadeType.ALL)//Because Mapped the extra table is not getting created so we dont want to add this field
    private List<PoliceOfficer> policeOfficers;

    @OneToMany(mappedBy = "police_station",cascade = CascadeType.ALL)
    private List<Fir>fir_s;

    public PoliceStation() {
    }

    public PoliceStation(int id, String station_name) {
        this.id = id;
        this.station_name = station_name;
    }

    public PoliceStation(int id, String station_name, List<PoliceOfficer> policeOfficers) {
        this.id = id;
        this.station_name = station_name;
        this.policeOfficers = policeOfficers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public List<PoliceOfficer> getPoliceOfficers() {
        return policeOfficers;
    }

    public void setPoliceOfficers(List<PoliceOfficer> policeOfficers) {
        this.policeOfficers = policeOfficers;
    }

    @Override
    public String toString() {
        return "PoliceStation{" +
                "id=" + id +
                ", station_name='" + station_name + '\'' +
                ", policeOfficers=" + policeOfficers +
                '}';
    }
}
