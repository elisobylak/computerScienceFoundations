import java.util.Scanner;
import java.util.Random;
 
public class Histo {
  // Make a histogram of random integers
  public static void main(String[] args){
    System.out.println("how many values (try 1000)?");
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int rolls = sc.nextInt();
    int[] bins = new int[6];
    for (int ix=1; ix <= rolls; ix++) {
      bins[rand.nextInt(6)]++;
    }
 
  for (int ix=0; ix<6; ix++) {
    System.out.print(ix + ":\t" + bins[ix] + " ");
       for (int jx=1; jx<bins[ix]; jx++) {
          System.out.print("*");
          }
    System.out.println("*");
    }
   }
}
 