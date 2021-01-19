package com.FlightReservationSystem;
public class Main {

    public static void main(String[] args) {
        //Ticket object
        Flight flight=new Flight("101","Jet Airways",100,60);
        Passenger passenger=new Passenger("Beed By Pass","Aurangabad","Maharashtra","Shardul","9130097931","shardulj418@gmail.com");
        System.out.println(Passenger.getIdCounter());

        //Regular Ticket object
        RegularTicket obj7=new RegularTicket("A1234","Delhi","Mumbai","19/1/2020 11:00AM","19/11/2020 1:00PM","25",7000.00f,flight,passenger,"food");
        System.out.println(obj7.getTicketDetails());

        //TouristTicket Object
        TouristTicket obj6=new TouristTicket("B1234","Mumbai","Shimla","20/1/2020 3:00PM","20/1/2020 5:00PM","26",15000.00f,flight,passenger,"Ahmedabad","Bihar","Shimla","Kashmir","Chandigarh","Shimla");
        System.out.println(obj6.getTicketDetails());
    }
}
