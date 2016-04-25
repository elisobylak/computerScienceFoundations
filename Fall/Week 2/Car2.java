/**
 * Java Lab Week 2
 *  Completed by Eli Sobylak | Help by Miles
 * 
The Car class is meant to illustrate 
a simple class
 */

import java.util.Calendar;

public class Car2 {
    String color;
    String make;
    int year;
    int thisYear = 2014;  // there is also a Calendar class that will get the current year

    public Car2(int yr) {
 year = yr;
    }

    public void setColor(String c) {
 color = c;
    }

    public String getColor() {
 return color;
    }

    public int getAge() {
 return thisYear - year;
    }

    public int getYear() {
 return year;
    }

    public void incrementYear() {
 thisYear = thisYear + 1;  // why don't you say int thisYear = thisYear + 1?
    }

    public static void main(String[] args){
 Car2 myCar = new Car2(2008);
 myCar.setColor("blue");
 String color = myCar.getColor();
 myCar.thisYear = myCar.thisYear + 1; // todo #2 
 {
   System.out.println(color); // todo #1
 }
 {
   System.out.println(myCar.year); // todo #3
 }
 {
   myCar.getAge();  // todo #4
   System.out.println(myCar.getAge());
 }
   
 // todo 1: print the color of myCar DONE

 // todo 2:  add 1 to myCar.thisYear DONE

 // todo 3: get and print the year of myCar DONE

 // todo 4: get and print the age of myCar in 2015 DONE

    }
}