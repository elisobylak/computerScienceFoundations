import java.util.*;

public class WordLines
{
  public static void main(String[] args)
  {
    System.out.println("Enter a string of text:");
    Scanner sc = new Scanner(System.in);
    String lines = sc.nextLine();
    
    String[] words = lines.split(" ");  
    
    for (String word : words)  
    {  
      System.out.println(word);  
    }
    
    int non_blank_counter = 0;
//your code to read String
    for(int i=0;i<lines.length();i++){
// .. inside a loop ..//
      if ( lines.charAt( i ) != ' ' )
        non_blank_counter++;
    }
    System.out.println("number of non blank characters are "+non_blank_counter);
       
  }
}