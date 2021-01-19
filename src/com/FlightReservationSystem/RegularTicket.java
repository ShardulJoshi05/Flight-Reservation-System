package com.FlightReservationSystem;

public class RegularTicket {
    private String specialServices;
    //constructor
    public RegularTicket(String specialServices){
        this.specialServices=specialServices;
    }
    //to get details of special services
    public String getSpecialServices() {
        return this.specialServices;
    }
    //to update details of special services
    public void updateSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }
}
