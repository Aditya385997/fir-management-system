package com.policesystem.firmanagement.payload;

import com.policesystem.firmanagement.model.ContactNumber;
import com.policesystem.firmanagement.model.Designation;

import java.util.List;

public class PoliceOfficerReqBody {
    private String req_name;
    private int req_age;


    private String designation;

    private String req_station_id;

    private List<ContactNumber>req_contactNumbers;

    public PoliceOfficerReqBody() {
    }

    public PoliceOfficerReqBody(String req_name, int req_age, List<ContactNumber> req_contactNumbers,String designation,String req_station_id) {
        this.req_name = req_name;
        this.req_age = req_age;
        this.req_contactNumbers = req_contactNumbers;
        this.designation = designation;
        this.req_station_id = req_station_id;
    }


    public String getReq_name() {
        return req_name;
    }

    public void setReq_name(String req_name) {
        this.req_name = req_name;
    }

    public int getReq_age() {
        return req_age;
    }

    public void setReq_age(int req_age) {
        this.req_age = req_age;
    }

    public List<ContactNumber> getReq_contactNumbers() {
        return req_contactNumbers;
    }

    public void setReq_contactNumbers(List<ContactNumber> req_contactNumbers) {
        this.req_contactNumbers = req_contactNumbers;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getReq_station_id() {
        return req_station_id;
    }

    public void setReq_station_id(String req_station_id) {
        this.req_station_id = req_station_id;
    }

    @Override
    public String toString() {
        return "PoliceOfficerReqBody{" +
                "req_name='" + req_name + '\'' +
                ", req_age=" + req_age +
                ", req_contactNumbers=" + req_contactNumbers +
                ", designation="+designation+
                '}';
    }
}
