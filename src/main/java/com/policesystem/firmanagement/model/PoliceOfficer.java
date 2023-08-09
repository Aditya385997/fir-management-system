package com.policesystem.firmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "police_officer")
public class PoliceOfficer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "police_officer_id")
    private Long id;
    @Column(name = "police_officer_name",nullable = false)
    private String name;
    @Column(name = "police_officer_age",nullable = false)
    private int age;

    @ManyToOne
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "designationId",nullable = false)
    private Designation designation;

    @ManyToOne
    @JoinColumn(name = "police_station_id")
    private PoliceStation policeStation;

    @ManyToMany(mappedBy = "policeOfficers",cascade = CascadeType.ALL)
    private List<Fir> firs;

    @OneToMany(mappedBy = "policeOfficer",cascade = CascadeType.ALL)
    private List<ContactNumber> contactNumberList ;


    public PoliceOfficer() {
    }

    public PoliceOfficer(Long id, String name, int age, Designation designation, List<ContactNumber> contactNumberList,PoliceStation policeStation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.contactNumberList = contactNumberList;
        this.policeStation = policeStation;
    }

    public PoliceOfficer(String name, int age, Designation designation, List<ContactNumber> contactNumberList) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.contactNumberList = contactNumberList;
    }

    public PoliceOfficer(Long id, String name, int age, Designation designation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }


    public List<ContactNumber> getContactNumberList() {
        return contactNumberList;
    }

    public void setContactNumberList(List<ContactNumber> contactNumberList) {
        this.contactNumberList = contactNumberList;
    }


    public PoliceStation getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(PoliceStation policeStation) {
        this.policeStation = policeStation;
    }

    @Override
    public String toString() {
        return "PoliceOfficer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contactNumberList=" + contactNumberList +
                ", Designation = "+designation+
                '}';
    }
}
/*
  Management Of Police
A policeOfficer can have one designation and one designation belongs to one Police Officer
A PoliceOfficer can have Many Numbers and Many Number can belong to one policeOfficer

A Police station have many police Officer but A police Officer can have only one police station


A Police Officer Can Register Many Fir (But Belongs to one Police Station)and Many FIR Are Register By One policeOfficer (Belongs to One police station)_


Inside Police Station the Fir is Registered and Every Police Station Have Thier own FIR


 */