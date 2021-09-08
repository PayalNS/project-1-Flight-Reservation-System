package com.flight;

public class Passenger {
    public int id;
    public Address address;
    public Contact contact;

    public Contact getContact(){
        return this.contact;
    }

    public Address getAddress(){
        return this.address;
    }

    public Passenger(int id, Address address, Contact contact) {
        this.id = id;
        this.address = address;
        this.contact = contact;
    }
}
