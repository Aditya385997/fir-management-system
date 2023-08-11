package com.policesystem.firmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "full_address",nullable = false)
    private String fullAddress;
    @Column(name = "postal_code",nullable = false)
    private int postalCode;
    @Column(name = "country",nullable = false)
    private String country;

    @Column(name="state",nullable = false)
    private String state;

    @Column(name = "city",nullable = false)
    private String city;

    @ManyToOne
    @JoinColumn(name = "police_id")
    private PoliceOfficer policeOfficer;

    @ManyToOne
    @JoinColumn(name="accused_pid")
    private AccusedPerson accusedPerson;

    public Address() {
    }

    public Address(Long addressId, String fullAddress, int postalCode, String country, String state, String city, PoliceOfficer policeOfficer, AccusedPerson accusedPerson) {
        this.addressId = addressId;
        this.fullAddress = fullAddress;
        this.postalCode = postalCode;
        this.country = country;
        this.state = state;
        this.city = city;
        this.policeOfficer = policeOfficer;
        this.accusedPerson = accusedPerson;
    }
}
