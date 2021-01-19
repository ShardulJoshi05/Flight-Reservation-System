package com.FlightReservationSystem;

public class RegularTicket extends Ticket{
    private String specialServices;
    //constructor
    public RegularTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,float price,Flight flight,Passenger passenger,String specialServices){
        super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,flight,passenger);
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
