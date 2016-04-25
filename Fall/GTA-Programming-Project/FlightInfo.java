/**GTA Project by Alex Bott and Eli Sobylak **/

import java.util.ArrayList;
import java.util.Scanner;


public class FlightInfo {
  private String name;
  private String destination;
  private String seat;
  
  public FlightInfo() {
    name = "default";
    destination = "default";
    seat = "default";
  }
  
  public String getName() {
    return name;
  }
  
  
  public String getDestination() {
    return destination;
  }
  
  public String getSeat() {
    return seat;
  }
  
  public String toString() {
    return '\n' + name + '\n' + destination + '\n' + seat;
  }
  
  public void setName() {
    System.out.println("Please enter your name");
    Scanner scan = new Scanner(System.in);
    name = scan.next();
  }
  
  
  public void setDestination() {
    System.out.println("Please enter your destination");
    Scanner scan = new Scanner(System.in);
    destination = scan.next();
  }
  
  public void setSeat() {
    System.out.println("Please choose a seat");
    Scanner scan = new Scanner(System.in);
    seat = scan.next();
  }
}

