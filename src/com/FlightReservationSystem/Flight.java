package com.FlightReservationSystem;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;
    //constructor
    public Flight(String flightNumber,String airline,int capacity,int bookedSeats){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.bookedSeats=bookedSeats;
    }
    //to get flight details
    public String getFlightDetails()
    {
        return flightNumber+" "+airline;
    }
    //to check if seats are available
    public boolean checkAvailability(){
        boolean ava=false;
        if(bookedSeats==capacity){
            ava = false;
        }
        if(bookedSeats < capacity) {
            ava = true;
        }
        return ava;
    }
    //to increment booking count
    public void incrementBookingCounter(){
        int count=0;
        count++;
    }

}

