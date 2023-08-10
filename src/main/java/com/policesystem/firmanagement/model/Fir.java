package com.policesystem.firmanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "police_fir")
public class Fir {

    /*
    * In Many To Many First We have To Save the Object and than add to the list and One Class Will Control the Mapping And Create the Join table;
    * */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fir_id")
    private Long id;
    @Column(name = "issued_person")
    private String issue_person;

    @ManyToOne
    @JoinColumn(name = "police_station_id",nullable = false)
    private PoliceStation police_station;

    @ManyToMany
    @JoinTable(name = "police_officers_id",joinColumns = {@JoinColumn(name = "fir_id")},inverseJoinColumns = {@JoinColumn(name = "police_officer_id")})
    private List<PoliceOfficer> policeOfficers;

    @Column(name = "crime_detail",nullable = false)
    private String crimeDetails;
    @ManyToMany
    @JoinTable(name = "fir_accused_list",joinColumns = {@JoinColumn(name = "accused_people_id")},inverseJoinColumns = {@JoinColumn(name = "fir_id")})
    private List<AccusedPerson> accusedPeoples;

    public Fir(){
    }

    public Fir(Long id, String issue_person, PoliceStation police_station, List<PoliceOfficer> policeOfficers, String crimeDetails, List<AccusedPerson> accusedPeoples) {
        this.id = id;
        this.issue_person = issue_person;
        this.police_station = police_station;
        this.policeOfficers = policeOfficers;
        this.crimeDetails = crimeDetails;
        this.accusedPeoples = accusedPeoples;
    }

    public Fir(Long id, String issue_person, PoliceStation police_station, String crimeDetails, List<AccusedPerson> accusedPeoples) {
        this.id = id;
        this.issue_person = issue_person;
        this.police_station = police_station;
        this.crimeDetails = crimeDetails;
        this.accusedPeoples = accusedPeoples;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIssue_person() {
        return issue_person;
    }

    public void setIssue_person(String issue_person) {
        this.issue_person = issue_person;
    }

    public PoliceStation getPolice_station() {
        return police_station;
    }

    public void setPolice_station(PoliceStation police_station) {
        this.police_station = police_station;
    }

    public String getCrimeDetails() {
        return crimeDetails;
    }

    public void setCrimeDetails(String crimeDetails) {
        this.crimeDetails = crimeDetails;
    }

    public List<PoliceOfficer> getPoliceOfficers() {
        return policeOfficers;
    }

    public void setPoliceOfficers(List<PoliceOfficer> policeOfficers) {
        this.policeOfficers = policeOfficers;
    }

    public List<AccusedPerson> getAccusedPeoples() {
        return accusedPeoples;
    }

    public void setAccusedPeoples(List<AccusedPerson> accusedPeoples) {
        this.accusedPeoples = accusedPeoples;
    }

    @Override
    public String toString() {
        return "Fir{" +
                "id=" + id +
                ", issue_person='" + issue_person + '\'' +
                ", police_station=" + police_station +
                ", crimeDetails='" + crimeDetails + '\'' +
                ", accusedPeoples=" + accusedPeoples +
                '}';
    }
}
