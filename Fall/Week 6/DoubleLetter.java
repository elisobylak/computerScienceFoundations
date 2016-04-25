import java.util.*;

public class DoubleLetter
{
  public static void main(String[] args) 
  {
    
    System.out.println("Enter a String to double");
    Scanner sc = new Scanner(System.in);
    String newString = sc.nextLine();
    
    for (int i = 0; i < newString.length(); i++){
      newString += newString.charAt(i) + newString.charAt(i);
    }
    System.out.println(newString);

  }
}
    
