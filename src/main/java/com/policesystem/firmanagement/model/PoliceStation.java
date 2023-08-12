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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "station_aid",nullable = false)
    private Address address;

    public PoliceStation() {
    }

    public PoliceStation(int id, String station_name,Address address) {
        this.id = id;
        this.station_name = station_name;
        this.address = address;
    }

    public PoliceStation(int id, String station_name, List<PoliceOfficer> policeOfficers, List<Fir> fir_s, Address address) {
        this.id = id;
        this.station_name = station_name;
        this.policeOfficers = policeOfficers;
        this.fir_s = fir_s;
        this.address = address;
    }

    public PoliceStation(int id, String station_name, List<PoliceOfficer> policeOfficers) {
        this.id = id;
        this.station_name = station_name;
        this.policeOfficers = policeOfficers;
    }

    public List<Fir> getFir_s() {
        return fir_s;
    }

    public void setFir_s(List<Fir> fir_s) {
        this.fir_s = fir_s;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
