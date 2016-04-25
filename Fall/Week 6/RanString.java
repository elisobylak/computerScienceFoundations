import java.util.*;


public class RanString
{
  public static void main(String[] args)
  {
    

    System.out.println("String");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
    int x = s.length();


    int r = ((int)(Math.random()*x));

    System.out.println(s.charAt(r));
  }
}