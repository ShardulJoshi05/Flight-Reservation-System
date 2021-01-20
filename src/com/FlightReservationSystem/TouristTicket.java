package com.FlightReservationSystem;


public class TouristTicket extends Ticket {
    private String hotelAddress;

    private String[] selectedTouristLocation = new String[5];

    //constructor for 5 locations
    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, Flight flight, Passenger passenger, String loc1, String loc2, String loc3, String loc4, String loc5, String hotelAddress) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation[0] = loc1;
        this.selectedTouristLocation[1] = loc2;
        this.selectedTouristLocation[2] = loc3;
        this.selectedTouristLocation[3] = loc4;
        this.selectedTouristLocation[4] = loc5;
    }

    //to get hotel address
    public String getHotelAddress() {
        return this.hotelAddress;
    }

    //to get tourist location
    public String getTouristLocation() {
        return selectedTouristLocation[0] + " " + selectedTouristLocation[1] + " " + selectedTouristLocation[2] + " " + selectedTouristLocation[3] + " " + selectedTouristLocation[4];
    }

    //to remove element of the array
    public void removeTouristLocation(String location) {
        int loc = 0, flag = 1;
        for (int i = 0; i < selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i].equalsIgnoreCase(location)) {
                flag = 1;
                loc = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            for (int i = loc + 1; i < selectedTouristLocation.length; i++) {
                selectedTouristLocation[i - 1] = selectedTouristLocation[i];
            }
            for (int i = 0; i < selectedTouristLocation.length - 1; i++) {
                System.out.print(selectedTouristLocation[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("City not found");
        }
    }


    //to add the element to array
    public void addTouristLocation(String location) {
        String[] arr=new String[selectedTouristLocation.length];
        for (int i = 0; i < selectedTouristLocation.length - 1; i++) {
            arr[i] = selectedTouristLocation[i];
        }
        arr[selectedTouristLocation.length-1]=location;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}