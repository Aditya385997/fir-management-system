package com.policesystem.firmanagement.payload;

import com.policesystem.firmanagement.model.Address;

public class PoliceStationReqBody {
    private String req_station_name;
    private Address address;

    public PoliceStationReqBody() {
    }

    public PoliceStationReqBody(String req_station_name, Address address) {
        this.req_station_name = req_station_name;
        this.address = address;
    }

    public String getReq_station_name() {
        return req_station_name;
    }

    public void setReq_station_name(String req_station_name) {
        this.req_station_name = req_station_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PoliceStationReqBody{" +
                "req_station_name='" + req_station_name + '\'' +
                ", address=" + address +
                '}';
    }
}
