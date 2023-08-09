package com.policesystem.firmanagement.response;

public class PolicesFromStationId {
    private String name;
    private int age;
    private String stationName;
    private String role;

    public PolicesFromStationId() {
    }

    public PolicesFromStationId(String name, int age, String stationName, String role) {
        this.name = name;
        this.age = age;
        this.stationName = stationName;
        this.role = role;
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

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "PolicesFromStationId{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stationName='" + stationName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
