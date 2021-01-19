package com.FlightReservationSystem;

public class Passenger {
    private static int idCounter=0;
    private int id=1;
    private Address address;
    private Contact contact;
    //constructor
    Passenger(String street,String city,String state,String name,String phone,String email){
        Address address=new Address(street,city,state);
        this.address=address;
        Contact contact=new Contact(name,phone,email);
        this.contact=contact;
        this.id=idCounter++;
    }
    //get idCount

    public static int getIdCounter() {
        return idCounter;
    }

    //get contact
    public String getContact() {
        return contact.getContactDetails();
    }
    //get address
    public String getAddress() {
        return address.getAddressDetails();
    }
    //get id
    public int getId(){return this.id;}

//Address class nested
    private static class Address {
        private String street;
        private String city;
        private String state;
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
    //Contact Class Nested
    private static class Contact {
        private String name;
        private String phone;
        private String email;
        //constructor
        public Contact(String name,String phone,String email){
            this.name=name;
            this.phone=phone;
            this.email=email;
        }
        //to get contact details
        public String getContactDetails(){
            return name+" "+phone+" "+email;
        }
        //to update contact details
        public void updateContactDetails(String name,String phone,String email){
            this.name=name;
            this.phone=phone;
            this.email=email;
        }
    }

}

