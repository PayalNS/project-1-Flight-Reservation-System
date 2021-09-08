package com.flight;

public class RegularTicket {
    public  String specialService;

    public String getSpecialServices(){
        return this.specialService;
    }
    public void updateSpecialServices(String specialServices){
        this.specialService = specialServices;
    }

    public RegularTicket(String specialService) {
        this.specialService = specialService;
    }
}

