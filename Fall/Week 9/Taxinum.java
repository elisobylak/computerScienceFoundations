/**
 * Auto Generated Java Class.
 */
public class Taxinum {
  public static void main(String[] args) { 
    
    for (int a=0; a<13; a++) {
      for (int b=0; b<13; b++) {
        for (int c=0; c<13; c++) {
          for (int d=0; d<13; d++) {
            if (a*a*a + b*b*b == c*c*c + d*d*d ) {
              System.out.println(a + " " + b + " " + c + " " + d);
              
            }
          }
        }
      }
    }
  }
}
