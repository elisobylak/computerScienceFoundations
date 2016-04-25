/**
 *  assumes that Die returns a random value ...
 */
import java.util.Scanner;
import java.util.Random;

public class TwoDice{
  public static void main (String[] args) {
    Die die1 = new Die();
    Die die2 = new Die();

    System.out.println("how many rolls?");
    Scanner sc = new Scanner(System.in);
    int rolls = sc.nextInt();
    
    
    for(int i = 0; i<rolls; i++) {
      die1.roll();
      die2.roll();
      DrawHisto.addNext(die1.getFaceValue()+die2.getFaceValue());
    }
        
    System.out.println(rolls + " rolls results in");
    
    DrawHisto.draw();
  } 
}