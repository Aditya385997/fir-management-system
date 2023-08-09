package com.policesystem.firmanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "criminal")
public class AccusedPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "criminal_id")
    private Long id;

    private String acc_name;

    private String acc_age;

    @ManyToMany(mappedBy = "accusedPeoples",cascade = CascadeType.ALL)
    private List<Fir> firs;

    public AccusedPerson() {
    }

    public AccusedPerson(Long id, String acc_name, String acc_age, List<Fir> firs) {
        this.id = id;
        this.acc_name = acc_name;
        this.acc_age = acc_age;
        this.firs = firs;
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

    @Override
    public String toString() {
        return "AccusedPerson{" +
                "id=" + id +
                ", acc_name='" + acc_name + '\'' +
                ", acc_age='" + acc_age + '\'' +
                ", firs=" + firs +
                '}';
    }
}
