package com.flight;

public class Ticket {
    public String pnr;
    public String from;
    public  String to;
    public  Flight flight;
    public String departureDateTime;
    public String arrivalDateTime;
    public Passenger passenger;
    public String seatNo;
    public float price;
    public boolean cancelled;


    public String checkStatus(){
    return  this.pnr;
    }
    public  int getFlightDuration(){
    return Integer.parseInt(this.departureDateTime) - Integer.parseInt(arrivalDateTime);
    }
    public  void cancel(){
    this.cancelled = true;
    }

    public Ticket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }
}
