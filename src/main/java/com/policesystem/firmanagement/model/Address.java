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

    @OneToOne(mappedBy = "address",cascade = CascadeType.ALL)
    private PoliceStation policeStation;

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

    public PoliceStation getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(PoliceStation policeStation) {
        this.policeStation = policeStation;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PoliceOfficer getPoliceOfficer() {
        return policeOfficer;
    }

    public void setPoliceOfficer(PoliceOfficer policeOfficer) {
        this.policeOfficer = policeOfficer;
    }

    public AccusedPerson getAccusedPerson() {
        return accusedPerson;
    }

    public void setAccusedPerson(AccusedPerson accusedPerson) {
        this.accusedPerson = accusedPerson;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", fullAddress='" + fullAddress + '\'' +
                ", postalCode=" + postalCode +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
