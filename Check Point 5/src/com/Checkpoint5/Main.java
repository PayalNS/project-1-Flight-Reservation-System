package com.Checkpoint5;

public class Main {

    public static void main(String[] args) {
        System.out.println("Flight Reservation System");
        Address address = new Address("Ambedkar Road", "Pune", "Maharashtra");
        Contact contact = new Contact("Sayali", "7684563523", "raina.toshi@gmail.com");
        Flight flight = new Flight("Mn21547", "JHY45823", 60, 50);
        Passenger passenger = new Passenger(235, address, contact, 1);
        RegularTicket regularTicket = new RegularTicket("Yes", "Regular_5842365", "Mumbai", "Delhi", flight,
                "23/02/2019 20.00", "24/02/2019 8.00", passenger, "N12",
                28926.252f, true);
        TouristTicket touristTicket = new TouristTicket("Sai Aangan, Shivaji Chawk, Delhi",
                new String[]{"Goa", "Bengaluru", "Pune", "Patna", "Kolkata"}, "Tourist_895226326", "Mumbai", "Delhi", flight,
                "23/02/2019 20.00", "24/02/2019 8.00", passenger, "N12", 28926.252f,
                true);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println("PNR Number of the tickets : " + ticket.getPnr());

    }
}


