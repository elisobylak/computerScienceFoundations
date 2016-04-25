import java.util.Scanner;

public class HailStone {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer");
    int num10;
    int m = 1;
    int max = 0;
    int num1 = scan.nextInt();
    int numstart = num1;
 
    while (num1!=1) {
        m++;
        if (num1 %2==0) {
            num1=num1/2;
            System.out.println(num1);
        } 
        else if(num1%2==1) {
            num1=num1*3+1;
            System.out.println(num1);
        } 
        else {
            if(num1==1)
                ;
        }
         
        // Finding the max
        if(max < num1)
            max = num1;
    }
    System.out.println("start: " + numstart);
    System.out.println("term count: " + m);
    System.out.println("biggest: " + max);
    }
}