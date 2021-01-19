package com.FlightReservationSystem;
import java.util.*;

public class TouristTicket extends Ticket{
    private String hotelAddress;

    private ArrayList<String> selectedTouristLocation=new ArrayList<String>();
    //constructor for hotel address
    //constructor for 5 locations
    public TouristTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,float price,Flight flight,Passenger passenger,String loc1,String loc2,String loc3,String loc4,String loc5,String hotelAddress){
        super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,flight,passenger);
        this.hotelAddress=hotelAddress;
        selectedTouristLocation.add(loc1);
        selectedTouristLocation.add(loc2);
        selectedTouristLocation.add(loc3);
        selectedTouristLocation.add(loc4);
        selectedTouristLocation.add(loc5);
    }
    //to get hotel address
    public String getHotelAddress(){
        return this.hotelAddress;
    }
    //to get tourist location
    public ArrayList<String> getTouristLocations(){
        return selectedTouristLocation;
    }
    //to remove element of the array
    public void removeTouristLocation(String location){
        selectedTouristLocation.remove(location);
    }
    //to add the element to array
    public void addTouristLocation(String location){
        selectedTouristLocation.add(location);
    }
}
