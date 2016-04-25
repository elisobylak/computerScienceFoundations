/**
 The Car class is meant to illustrate 
 a simple class
 
*This was doen by Eli Sobylak with help from Megan
 */


public class Car {
  String color;
  String make;
  int year;
  
  public void setColor(String c) {
    color = c;
  }
  
  public String getColor() {
    return color;
  }
  
  public void setMake(String c) {
    make = c;
  }
  
  public String getMake() {
    return make;
  }
  public static void main(String[] args){
    Car myCar = new Car();
    myCar.setColor("green");
    myCar.setMake("Chevy");
    
    String color = myCar.getColor();
    String make = myCar.getMake();
    System.out.println("The color is " + color);
    System.out.println("The make is " + make); }
  }

