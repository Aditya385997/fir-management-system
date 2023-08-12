package com.policesystem.firmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

//Always Remember Mapping is done with child
@Entity
@Table(name = "designation")
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "designation_id")
    private Long id;

    //Cascade is basically when we add the data in One Table The data Automatically to the Table

    @OneToMany(mappedBy = "designation",cascade = CascadeType.ALL)
    @Transient
    @JsonIgnore
    private List<PoliceOfficer> policeOfficers;

    @Column(name = "designation_role",nullable = false)
    private String role;

    public Designation() {
    }

    public Designation(Long id, String role) {
        this.id = id;
        this.role = role;
    }

    public Designation(Long id, List<PoliceOfficer> policeOfficers, String role) {
        this.id = id;
        this.policeOfficers = policeOfficers;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PoliceOfficer> getPoliceOfficer() {
        return policeOfficers;
    }

    public void setPoliceOfficer(List<PoliceOfficer> policeOfficer) {
        this.policeOfficers = policeOfficer;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Designation{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
