package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMain {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC", 10, 10);
        List<Theatre.Seat> seats = new ArrayList<>(theatre.seats);
        printList(seats);
        theatre.getTheatreName();
        theatre.getSeats();
        //Reserve the seat twice to throw error
        if (theatre.reserveSeat("J09")) {
            System.out.println("Please proceed to payment CLICK HERE");
        } else {
            System.out.println("Seat trying to reserve is already taken");
        }
        if (theatre.reserveSeat("J09")) {
            System.out.println("Please proceed to payment CLICK HERE");
        } else {
            System.out.println("Seat trying to reserve is already taken");
        }
//For validating - made private to public and tested
        /*List<Theatre.Seat> seats = new ArrayList<Theatre.Seat>(theatre.seats);
        printList(seats);
        seats.get(84).isReserved();
        seats.get(84).isReserved();
        Collections.min(seats);
        Collections.max(seats);
        Collections.binarySearch(seats.subList(56,89));
        Collections.reverse(seats);
        Collections.sort(seats);
        System.out.println("************************");
        System.out.println("seats shuffling");
        System.out.println("************************");
        Collections.shuffle(seats);
        printList(seats);
        System.out.println("\n"+"************************");
        System.out.println("seats shuffled");
        System.out.println("************************");
        System.out.println("sorting the seats");
        System.out.println("************************");
        sortList(seats);
        printList(seats);
        System.out.println("\n"+"************************");
        System.out.println("Now seats are sorted");
        System.out.println("************************");

    }*/


    }
    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.print(""+seat.getSeatNumber()+seat.getPrice());
        }
        System.out.println("\n"+"******End of the line************");
    }

 /*   public static void sortList(List<Theatre.Seat> list){
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1; j< list.size();j++){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }*/

}
