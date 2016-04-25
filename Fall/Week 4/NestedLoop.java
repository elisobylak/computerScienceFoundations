import java.util.Scanner;

public class NestedLoop
{
        public static void main(String[] args)
        {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number of stars");
                int rows = scan.nextInt();
                String stars = "*";
                for (int i=0; i<rows; i++)
                {
                        System.out.println(stars);
                        stars =" "+stars;
                }
        }
}