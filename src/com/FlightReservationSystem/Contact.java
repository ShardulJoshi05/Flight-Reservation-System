package com.FlightReservationSystem;

    public class Contact {
        String name;
        String phone;
        String email;
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


