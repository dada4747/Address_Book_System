package com.bridgelab.main;

public class Contacts {
    private String fName;
    private String lName;
    private String address;
    private String city;
    private String state;
    private Long zip;
    private Long phone;
    private String email;

    public Contacts(String fName, String lName, String address, String city, String state, Long zip, Long phone,
                    String email) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "\nFirst_Name  : " + fName +
                "\nLast_Name   : " + lName +
                "\nAddress     : " + address +
                "\nCity        : " + city +
                "\nState       : " + state +
                "\nZIP Code    : " + zip +
                "\nPhone_Number: " + phone +
                "\nEmail_ID    : " + email +
                "\n-----------------------------------";
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
