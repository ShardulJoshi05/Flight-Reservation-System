package com.FlightReservationSystem;

public class Passenger {
    public int id;
    public String address;
    public String contact;
    //constructor
    Passenger(int id,String address,String contact){
        this.id=id;
        this.address=address;
        this.contact=contact;
    }
    //get contact
    public String getContact() {
        return this.contact;
    }
    //get address
    public String getAddress() {
        return this.address;
    }
    public int getId(){return this.id;}
}

