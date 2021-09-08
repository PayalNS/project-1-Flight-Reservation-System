package com.Checkpoint3;

public class RegularTicket extends Ticket{
    private  String specialService;

    public String getSpecialServices(){
        return this.specialService;
    }
    public void updateSpecialServices(String specialServices){
        this.specialService = specialServices;
    }

    public RegularTicket(String specialService) {
        this.specialService = specialService;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }
}

