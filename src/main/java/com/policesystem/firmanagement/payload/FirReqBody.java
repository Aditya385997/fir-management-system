package com.policesystem.firmanagement.payload;

import com.policesystem.firmanagement.model.AccusedPerson;
import com.policesystem.firmanagement.model.PoliceOfficer;

import java.util.List;

public class FirReqBody {
    private String criminalDetail;
    private String issuedPerson;

    private String policeStationId;

    private String policeOfficerId;
    private List<AccusedPerson> accusedPeople;

    public FirReqBody() {
    }

    public FirReqBody(String criminalDetail, String issuedPerson, String policeStationId, List<AccusedPerson> accusedPeople,String policeOfficerId) {
        this.criminalDetail = criminalDetail;
        this.issuedPerson = issuedPerson;
        this.policeStationId = policeStationId;
        this.policeOfficerId = policeOfficerId;
        this.accusedPeople = accusedPeople;
    }


    public FirReqBody(String criminalDetail, String issuedPerson, String policeStationId) {
        this.criminalDetail = criminalDetail;
        this.issuedPerson = issuedPerson;
        this.policeStationId = policeStationId;
    }


    public List<AccusedPerson> getAccusedPeople() {
        return accusedPeople;
    }

    public void setAccusedPeople(List<AccusedPerson> accusedPeople) {
        this.accusedPeople = accusedPeople;
    }

    public String getPoliceOfficerId() {
        return policeOfficerId;
    }

    public void setPoliceOfficerId(String policeOfficerId) {
        this.policeOfficerId = policeOfficerId;
    }

    public String getCriminalDetail() {
        return criminalDetail;
    }

    public void setCriminalDetail(String criminalDetail) {
        this.criminalDetail = criminalDetail;
    }

    public String getIssuedPerson() {
        return issuedPerson;
    }

    public void setIssuedPerson(String issuedPerson) {
        this.issuedPerson = issuedPerson;
    }

    public String getPoliceStationId() {
        return policeStationId;
    }

    public void setPoliceStationId(String policeStationId) {
        this.policeStationId = policeStationId;
    }

    @Override
    public String toString() {
        return "FirReqBody{" +
                "criminalDetail='" + criminalDetail + '\'' +
                ", issuedPerson='" + issuedPerson + '\'' +
                ", policeStationId='" + policeStationId + '\'' +
                ", accusedPeople=" + accusedPeople +
                ", policeOfficer=" + policeOfficerId+
                '}';
    }
}
