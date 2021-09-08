package com.Checkpoint4;

public class Passenger {
    private int id;
    private static int idCounter;
    private Address address;
    private Contact contact;

    public Contact getContact(){
        return this.contact;
    }

    public Address getAddress(){
        return this.address;
    }

    public Passenger(int id, Address address, Contact contact, int idCounter) {
        this.id = id;
        this.address = new Address("Shiwaji Road","Mumbai","Maharashtra");
        this.contact = new Contact("Sara","8965324578","mani.mhatre@gmail.com");
        this.idCounter = idCounter + 1;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }
    public int getPassengerCount(){
        return  this.idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}



