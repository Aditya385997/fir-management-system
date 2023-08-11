package com.policesystem.firmanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "accused_people")
public class AccusedPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accused_people_id")
    private Long id;

    @Column(name = "accused_people_name",nullable = false)
    private String acc_name;

    @Column(name = "accused_people_age",nullable = false)
    private String acc_age;

    @OneToMany(mappedBy = "accusedPerson",cascade = CascadeType.ALL)
    private List<ContactNumber> contactNumbers;
    @ManyToMany(mappedBy = "accusedPeoples",cascade = CascadeType.ALL)
    private List<Fir> firs;

    @OneToMany(mappedBy = "accusedPerson",cascade = CascadeType.ALL)
    private List<AccusedPerson> accusedPeoples;

    public AccusedPerson() {
    }

    public AccusedPerson(Long id, String acc_name, String acc_age, List<ContactNumber> contactNumbers, List<Fir> firs, List<AccusedPerson> accusedPeoples) {
        this.id = id;
        this.acc_name = acc_name;
        this.acc_age = acc_age;
        this.contactNumbers = contactNumbers;
        this.firs = firs;
        this.accusedPeoples = accusedPeoples;
    }

    public AccusedPerson(String acc_name, String acc_age, List<ContactNumber> contactNumbers) {
        this.acc_name = acc_name;
        this.acc_age = acc_age;
        this.contactNumbers = contactNumbers;
    }
    public AccusedPerson(Long id, String acc_name, String acc_age, List<Fir> firs) {
        this.id = id;
        this.acc_name = acc_name;
        this.acc_age = acc_age;
        this.firs = firs;
    }


    public List<AccusedPerson> getAccusedPeoples() {
        return accusedPeoples;
    }

    public void setAccusedPeoples(List<AccusedPerson> accusedPeoples) {
        this.accusedPeoples = accusedPeoples;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public String getAcc_age() {
        return acc_age;
    }

    public void setAcc_age(String acc_age) {
        this.acc_age = acc_age;
    }

    public List<Fir> getFirs() {
        return firs;
    }

    public void setFirs(List<Fir> firs) {
        this.firs = firs;
    }


    public List<ContactNumber> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(List<ContactNumber> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    @Override
    public String toString() {
        return "AccusedPerson{" +
                "id=" + id +
                ", acc_name='" + acc_name + '\'' +
                ", acc_age='" + acc_age + '\'' +
                '}';
    }
}
