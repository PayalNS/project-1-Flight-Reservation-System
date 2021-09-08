package com.flight;

public class TouristTicket {
    public  String hotelAddress;
    public  String[] selectedTouristLocation;

    public String getHotelAddress(){
        return this.hotelAddress;
    }
    public String[] getTouristLocations(){
        selectedTouristLocation = new String[]{"Goa"};
        for (int i = 0; i < selectedTouristLocation.length; i++) {
            System.out.println(selectedTouristLocation[i] + " ");
        }
        return selectedTouristLocation;
    }
    public void removeTouristLocations(String location){
        String[] anotherArray = new String[selectedTouristLocation.length];
        for (int i = 0, k = 0; i < selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i].equals(location)) {
                continue;
            }
            anotherArray[k++] = selectedTouristLocation[i];
            //this.selectedTouristLocation[i] = anotherArray[k++];
        }
    }
    public void addTouristLocations(String location){
        this.selectedTouristLocation[0] = location;

   }

    public TouristTicket(String hotelAddress, String[] selectedTouristLocation) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }
}

