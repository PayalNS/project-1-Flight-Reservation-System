package com.Checkpoint3;

public class TouristTicket extends Ticket {
    private  String hotelAddress;
    private  String[] selectedTouristLocation;

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
        }
    }
    public void addTouristLocations(String location){
        this.selectedTouristLocation[0] = location;
    }
    public TouristTicket(String hotelAddress, String[] selectedTouristLocation) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }
    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
}



