package com.flight;

public class Main {
    public static  void main(String[]args){
        System.out.println( "Flight Reservation System");
        Address address = new Address("Ambedkar Road", "Pune", "Maharashtra");
        Contact contact = new Contact("Sayali", "7684563523","raina.toshi@gmail.com");
        Flight flight = new Flight("Mn21547","JHY45823", 60,50);
        Passenger passenger = new Passenger(235,address,contact);
        RegularTicket regularTicket = new RegularTicket("Yes");
        Ticket ticket = new Ticket("5842365","Mumbai","Delhi",flight,
                "23/02/2019 20.00","24/02/2019 8.00",passenger,"123",2896.252f,true);
        TouristTicket touristTicket = new TouristTicket("Sai Aangan, Shivaji Chawk, Delhi",new String[]{"Goa","Bengaluru","Pune","Patna","Kolkata"});


        address.updateAddressDetails("Shiwaji Road");
        System.out.println("Address Details: " + address.getAddressDetails());

        contact.updateContactDetails("8563214596");
        System.out.println("Contact Details: " +contact.getContactDetails());

        flight.incrementBookingCounter();
        System.out.println("Flight Details: " +flight.getFlightDetails());
        System.out.println("Availability: " +flight.checkAvailability());

        System.out.println("Contact Details: " +passenger.getContact());
        System.out.println("Address Details: " +passenger.getAddress());

        regularTicket.updateSpecialServices("yes");
        System.out.println("Special Services: " +regularTicket.getSpecialServices());

       touristTicket.removeTouristLocations("Delhi");
       touristTicket.addTouristLocations("Kerala");
        System.out.println("Hotel Address: " +touristTicket.hotelAddress);
        touristTicket.getTouristLocations();

        ticket.cancel();
        System.out.println("Status: " +ticket.checkStatus());

    }
}
