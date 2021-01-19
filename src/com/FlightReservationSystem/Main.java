package com.FlightReservationSystem;
public class Main {

    public static void main(String[] args) {
        /*
        //TouristTicket Object
        TouristTicket obj4=new TouristTicket("Mumbai");
        TouristTicket obj5=new TouristTicket("Mumbai","Pune","Hyderabad","Chennai","Bangalore");
        System.out.println(obj4.getHotelAddress());
        System.out.println(obj5.getTouristLocations());
        obj5.removeTouristLocation("Chennai");
        System.out.println(obj5.getTouristLocations());
        obj5.addTouristLocation("Aurangabad");
        System.out.println(obj5.getTouristLocations());
        //Regular Ticket object
        RegularTicket obj7=new RegularTicket("Food");
        System.out.println(obj7.getSpecialServices());
        obj7.updateSpecialServices("Food Wine");
        System.out.println(obj7.getSpecialServices());*/

        //Ticket object
        Flight flight=new Flight("1001","Jet Airways",100,60);
        Passenger passenger=new Passenger("Beed By Pass","Aurangabad","Maharashtra","Shardul","9130097931","shardulj418@gmail.com");
        Ticket obj6=new Ticket("A1234","Delhi","Mumbai","19/1/2020 11:00AM","19/11/2020 1:00PM","25",7000.00f,flight,passenger);
        System.out.println(obj6.getTicketDetails());
        System.out.println(obj6.getFlightDuration(2));
        System.out.println(obj6.checkStatus());
        obj6.cancel();
        System.out.println(obj6.checkStatus());
        System.out.println(obj6.flight.getFlightDetails());
        System.out.println(obj6.flight.checkAvailability());
        System.out.println(obj6.passenger.getAddress());
        System.out.println(obj6.passenger.getContact());
        System.out.println(obj6.passenger.getId());
        System.out.println(Passenger.getIdCounter());

    }
}
