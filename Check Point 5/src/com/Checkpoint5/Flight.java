package com.Checkpoint5;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public String getFlightDetails(){
        return flightNumber+airline;
    }

    public boolean checkAvailability() {
        return (capacity - bookedSeats > 0) ? true : false;
    }
    public void incrementBookingCounter(){
        this.bookedSeats = this.bookedSeats + 1;
    }

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}


