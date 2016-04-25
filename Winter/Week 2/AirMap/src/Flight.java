import java.util.*;
import java.io.*;
import java.lang.*;

public class Flight {
int number;
Airport from;
Airport to;
int departureTime;
int arrivalTime;
float cost;
int seats;
String airline;

public Flight(int num, String fromst, String tost, 
              int dep, int art, float cos, int sea, String ast) { 
  number = num;
  from = Airport.named(fromst);
  to = Airport.named(tost);
  departureTime = dep;
  arrivalTime = art;
  cost = cos;
  seats = sea;
  airline = ast;
  from.addDeparture(this);
  System.out.println(from + "->" + to );
}

    public String toString () {
      return(number + ":\t" + from.name() + "->" + to.name() + "\t" 
               + duration() + "min = " + departureTime + ".." + arrivalTime + "\t$" 
               + cost + "\t" + airline);
    }

    public Airport from() { return (from); }
   
    public Airport to() { return (to); }
   
    public float cost() { return (cost); }
   
    public int arrivalTime() { return (arrivalTime); }
   
    public int departureTime() { return (departureTime); }
    
    public int duration() { 
      int dur = arrivalTime - departureTime;
      if ( dur < 0) dur = dur + 1440;
      return (dur);
    }
   
    public static void loadFlights () { 
      try {
        Scanner scn = new Scanner(new File("Flights2.csv")).useDelimiter(",\\s*");
        scn.nextLine();
        while (scn.hasNext()) {
        	System.out.println();
          Flight flt = new Flight(scn.nextInt(), scn.next(), scn.next(), scn.nextInt(), scn.nextInt(),  scn.nextFloat(), scn.nextInt(), scn.next());
        }
      } catch (Exception ex){
        ex.printStackTrace();
      }
    }   
 

}