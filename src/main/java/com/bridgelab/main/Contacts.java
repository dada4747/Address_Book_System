package com.bridgelab.main;

//import org.demo.com.Contact;

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

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public Long getZip() {
        return zip;
    }

    public Long getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Contacts))
            return false;

        Contacts other = (Contacts) obj;
        if (!(fName.equalsIgnoreCase(other.getfName())))
            return false;
        if (!(lName.equalsIgnoreCase(other.getlName())))
            return false;
        if (!(address.equalsIgnoreCase(other.getAddress())))
            return false;
        if (!(city.equalsIgnoreCase(other.getCity())))
            return false;
        if (!state.equalsIgnoreCase(other.getState()))
            return false;
        if (!zip.equals(other.getZip()))
            return false;
        if (!(phone.equals(other.getPhone())))
            return false;
        return email.equals(other.getEmail());
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

}
