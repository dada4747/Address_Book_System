package com.bridgelab.main;

public class Contacts {
    String firstName;
    String lastName;
    String address;
    String City;
    String state;
    Long zipCode;
    Long phoneNumber;
    String email;

    public Contacts(String firstName, String lastName, String address, String city, String state, Long zipCode, Long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.City = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
