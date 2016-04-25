
public class DrawHisto {
    public static final int MAX = 13;
    static int[] bins = new int[MAX];
    

    // Make a histogram of random integers
    public static void draw(){
 for (int i=2; i<MAX; i++) {
     System.out.print(i + ":\t" + bins[i] + " ");
     for (int jx=1; jx<bins[i]; jx++) {
  System.out.print("*");
     }
     System.out.println("*");
 }
    }
    
    public static void addNext(int dat) {
 if (dat < MAX && dat >= 0) {
     bins[dat]++;
 }
    }
}