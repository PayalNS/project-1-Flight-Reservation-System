package com.Checkpoint5;

public class RegularTicket extends Ticket{
    private  String specialService;

    public RegularTicket(String specialService,String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        super(pnr, from, to, flight,departureDateTime, arrivalDateTime, passenger, seatNo,price,cancelled);
        this.specialService = specialService;
    }
    public String getSpecialServices(){
        return this.specialService;
    }
    public void updateSpecialServices(String specialServices){
        this.specialService = specialServices;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }
}

