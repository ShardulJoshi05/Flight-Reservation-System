package com.FlightReservationSystem;
public class Address {
public String street;
public String city;
public String state;
//constructor
public Address(String street,String city,String state){
    this.street=street;
    this.city=city;
    this.state=state;
}
//get address details
public String getAddressDetails(){
    return this.street+" "+this.city+" "+this.state;
}
//update address details
public void updateAddressDetails(String street,String city,String state){
    this.street=street;
    this.city=city;
    this.state=state;
}
}
