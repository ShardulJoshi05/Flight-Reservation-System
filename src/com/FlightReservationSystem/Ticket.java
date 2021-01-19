package com.FlightReservationSystem;

public class Ticket{
    private String pnr;
    private String from;
    private String to;
    public Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    public Passenger passenger;
    private String seatNo;
    private float price;
    private boolean cancelled;
    //constructor to take parameter

    public Ticket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,float price,Flight flight,Passenger passenger){
        this.pnr=pnr;
        this.from=from;
        this.to=to;
        this.departureDateTime=departureDateTime;
        this.arrivalDateTime=arrivalDateTime;
        this.seatNo=seatNo;
        this.price=price;
        this.cancelled=false;
        this.flight=flight;
        this.passenger=passenger;
    }



    public String getTicketDetails(){
        return this.pnr+" "+this.from+" "+this.to+" "+this.departureDateTime+" "+this.arrivalDateTime+" "+this.seatNo+" "+this.price;
    }
    // to check status
    public String checkStatus(){
        String status;
        if(this.cancelled==true){
            status="Cancelled";
        }
        else{
            status="Confirmed";
        }
        return status;
    }
    //to calculate duration
    public int getFlightDuration(int duration){
        return duration;
    }
    //to cancel ticket
    public void cancel(){
        this.cancelled=true;
    }


}

