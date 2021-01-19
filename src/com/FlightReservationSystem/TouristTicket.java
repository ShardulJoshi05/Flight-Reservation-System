package com.FlightReservationSystem;
import java.util.*;
public class TouristTicket {
    public String hotelAddress;

    ArrayList<String> selectedTouristLocation=new ArrayList<String>();
    //constructor for hotel address
    public TouristTicket(String hotelAddress){
        this.hotelAddress=hotelAddress;
    }
    //constructor for 5 locations
    public TouristTicket(String loc1,String loc2,String loc3,String loc4,String loc5){
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
