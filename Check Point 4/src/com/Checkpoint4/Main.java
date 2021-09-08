package com.Checkpoint4;

public class Main {

        public static  void main(String[]args){
            System.out.println( "Flight Reservation System");
            Address address = new Address("Ambedkar Road", "Pune", "Maharashtra");
            Contact contact = new Contact("Sayali", "7684563523","raina.toshi@gmail.com");
            Flight flight = new Flight("Mn21547","JHY45823", 60,50);
            Passenger passenger = new Passenger(235,address,contact,1);
            RegularTicket regularTicket = new RegularTicket("Yes","5842365","Mumbai","Delhi",flight,
                     "23/02/2019 20.00","24/02/2019 8.00",passenger,"N12",
                    28926.252f,true);
            TouristTicket touristTicket = new TouristTicket("Sai Aangan, Shivaji Chawk, Delhi",
                    new String[]{"Goa","Bengaluru","Pune","Patna","Kolkata"},"5842365","Mumbai","Delhi",flight,
                    "23/02/2019 20.00","24/02/2019 8.00",passenger,"N12",28926.252f,true);

            System.out.println("Flight Number: " + flight.getFlightNumber());
            System.out.println("Airline: " + flight.getAirline());
            System.out.println("Capacity: " + flight.getCapacity());
            System.out.println("Booked Seat: " + flight.getBookedSeats());

//            address.updateAddressDetails("Shiwaji Road");
//            System.out.println("Address Details: " + address.getAddressDetails());
//            System.out.println("City: " + address.getCity());
//            System.out.println("State: " + address.getState());
//            System.out.println("Street: " + address.getStreet());
//
//            contact.updateContactDetails("8563214596");
//            System.out.println("Contact Details: " +contact.getContactDetails());
//
//            System.out.println("Contact Details: " +passenger.getContact());
//            System.out.println("Address Details: " +passenger.getAddress());
//
//            regularTicket.updateSpecialServices("yes");
//            System.out.println("Special Services: " +regularTicket.getSpecialServices());
//
//            touristTicket.removeTouristLocations("Delhi");
//            touristTicket.addTouristLocations("Kerala");
//            System.out.println("Hotel Address: " +touristTicket.getHotelAddress());
//            touristTicket.getTouristLocations();
//
//            ticket.cancel();
//            System.out.println("Status: " +ticket.checkStatus());
        }
    }


