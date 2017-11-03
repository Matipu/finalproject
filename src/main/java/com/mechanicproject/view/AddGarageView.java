package com.mechanicproject.view;

public class AddGarageView {

    private String name;
    private String street;
    private String city;
    private String country;

    public AddGarageView(String name, String street, String city, String country) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    AddGarageView(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}