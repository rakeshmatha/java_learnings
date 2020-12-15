package Collections;

import javax.swing.*;
import java.util.*;
import java.util.function.ToDoubleFunction;

public class Theatre {
    private final String theatreName;
//    private List<Seat> seats = new ArrayList<>();
    //can use any of it in collection framework
    public List<Seat> seats = new ArrayList<>();

    public String getTheatreName() {
        return theatreName;
    }

   static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {

       @Override
       public int compare(Seat seat1, Seat seat2) {
           if(seat1.getPrice()>seat2.getPrice()){
               return -1;
           }
           else if(seat1.getPrice()<seat2.getPrice()){
               return 1;
           }else{
               return 0;
           }
       }
   };


    public Theatre(String theatreName, int numRows, int seatsPerRow){
        this.theatreName= theatreName;
        //  suppose noofrows =10 , A ascii value is 65, last row would be 74, A=65  and loop until 74 =j
    int lastRow = 'A' + (numRows -1);
    for(char row='A'; row <= lastRow ;row++){
        //seatNumber in a row seatNum=1 as it cant be 0
        for(int seatNum=1; seatNum <= seatsPerRow ;seatNum++){
            double price =12.00;
            if((row < 'D') &&( seatNum>=5 && seatNum <=10 )){
                price = 14.00;
            }
            else if((row >'G') && (seatNum >5 && seatNum <=10)){
                price =8.00;
            }
            //create object to use them
            Seat seat = new Seat(row+String.format("%d ",seatNum), price);
            seats.add(seat);
        }
    }
    }

    public boolean reserveSeat(String seatNum) {
        Seat requestedSeat = new Seat(seatNum,0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return  this.seats.get(foundSeat).isReserved();
        } else {
            System.out.println("Seat looking for is not available");
        return false;
        }
    }
    //If dont use binary search we need to write the code as below.
/*        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNum)){
                requestedSeat =seat;
                break;
            }
        }
            if(requestedSeat == null) {
                System.out.println("Requested Seat "+ requestedSeat +" is not available");
                return false;
            }
        return requestedSeat.isReserved();
    }*/

    public Collection<Theatre.Seat> getSeats(){
        return seats;
        //if method is void need this loop to traverse
        /*for(Seat seat: seats){
            System.out.print((seat.getSeatNumber()));*/
        }

    //Inner private Class
    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        //parameterized constructor
        private Seat(String seatNumber,double price) {
            this.seatNumber = seatNumber;
            this.price =price;
        }
        //getter from instance variable
        public String getSeatNumber() {
            return seatNumber;
        }
        public double getPrice() {
            return price;
        }

        //method to be used from this inner private class - To check is seat reserved
        public boolean isReserved(){
            //if this seat is reserved then only go into if block  (because default we kept it as false ) if not just return false
            if(!this.reserved){
                this.reserved= true;
                System.out.println("Seat "+seatNumber+" is reserved");
                return true;
            }
            else {
                System.out.println("The Seat you trying to reserve is already taken.Please choose different seat.");
                return false;
            }
        }

        //Boolean that is the ticket is cancelled or not
        public boolean cancelled(){
            if(this.reserved){
                this.reserved =false;
                System.out.println("Reservation of this seat "+seatNumber+" is cancelled");
                return true;
            }
            else {
                return false;
            }
        }

        //comparing it with seat number from the input , it will be done when we do binary search
        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareTo(seat.getSeatNumber());
        }
    }
}