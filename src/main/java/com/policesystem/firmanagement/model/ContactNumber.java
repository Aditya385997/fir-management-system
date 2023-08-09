package com.policesystem.firmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "police_contacts")
public class ContactNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "police_contact_id")
    private Long id;

    @Column(name = "police_contact_phoneNumber",nullable = false)
    private String ph_no;

    @ManyToOne
    @JoinColumn(name = "police_id",nullable = false)
    private PoliceOfficer policeOfficer;

    public ContactNumber() {
    }

    public ContactNumber(Long id, String ph_no, PoliceOfficer policeOfficer) {
        this.id = id;
        this.ph_no = ph_no;
        this.policeOfficer = policeOfficer;
    }

    public ContactNumber(Long id, String ph_no) {
        this.id = id;
        this.ph_no = ph_no;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public PoliceOfficer getPoliceOfficer() {
        return policeOfficer;
    }

    public void setPoliceOfficer(PoliceOfficer policeOfficer) {
        this.policeOfficer = policeOfficer;
    }

    @Override
    public String toString() {
        return "ContactNumber{" +
                "id=" + id +
                ", ph_no='" + ph_no + '\'' +
                '}';
    }
}
