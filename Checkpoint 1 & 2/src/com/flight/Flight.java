package com.flight;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;
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
}
