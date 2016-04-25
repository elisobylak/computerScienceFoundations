import java.io.*;
 import java.util.*;
 
 public class WriteFile{
   public static void main(String[] args)  throws IOException
   {
     String fileName;
     System.out.println("Enter a file name. It will hold output");
     Scanner nameReader = new Scanner(System.in);
     fileName = nameReader.nextLine();
     PrintWriter writer = new PrintWriter(fileName);
     Scanner scan = new Scanner(System.in);
     String s = " "; // a String of length 1
     System.out.println("Enter text, end with 2 returns");
     while(s.length() > 0){
       s = scan.nextLine();
       writer.println(s);
     }
     writer.close();
     // now echo the file back to the console
     Echo e = new Echo(fileName);
     System.out.println("Here comes the echo");
     System.out.println();
     e.readLines();
   }
 }