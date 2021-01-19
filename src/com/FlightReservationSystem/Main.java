package com.FlightReservationSystem;
public class Main {

    public static void main(String[] args) {
        //Address object
        Address obj1=new Address("Beed By Pass","Aurangabad","Maharashtra");
        System.out.println(obj1.getAddressDetails());
        obj1.updateAddressDetails("Beed By Pass","Mumbai","Maharashtra");
        System.out.println(obj1.getAddressDetails());
        //Contact object
        Contact obj2=new Contact("Shardul","9130097931","shardulj418@gmail.com");
        System.out.println(obj2.getContactDetails());
        obj2.updateContactDetails("Shardul","9130097931","shardulj.nmims@gmail.com");
        System.out.println(obj2.getContactDetails());
        //Flight object
        Flight obj3=new Flight("10001","Jet Airways",100,60);
        System.out.println(obj3.getFlightDetails());
        System.out.println(obj3.checkAvailability());
        obj3.incrementBookingCounter();
        //TouristTicket Object
        TouristTicket obj4=new TouristTicket("Mumbai");
        TouristTicket obj5=new TouristTicket("Mumbai","Pune","Hyderabad","Chennai","Bangalore");
        System.out.println(obj4.getHotelAddress());
        System.out.println(obj5.getTouristLocations());
        obj5.removeTouristLocation("Chennai");
        System.out.println(obj5.getTouristLocations());
        obj5.addTouristLocation("Aurangabad");
        System.out.println(obj5.getTouristLocations());
        //Ticket Object
        Ticket obj6=new Ticket("A1234","Delhi","Mumbai","19/1/2020 11:00AM","19/11/2020 1:00PM","25",7000.00f);
        System.out.println(obj6.getTicketDetails());
        System.out.println(obj6.getFlightDuration(2));
        System.out.println(obj6.checkStatus());
        obj6.cancel();
        System.out.println(obj6.checkStatus());
        //Regular Ticket object
        RegularTicket obj7=new RegularTicket("Food");
        System.out.println(obj7.getSpecialServices());
        obj7.updateSpecialServices("Food Wine");
        System.out.println(obj7.getSpecialServices());
        //Passenger object
        Passenger obj8=new Passenger(485,"Delhi","9130097931");
        System.out.println(obj8.getAddress());
        System.out.println(obj8.getContact());
        System.out.println(obj8.getId());
    }
}
