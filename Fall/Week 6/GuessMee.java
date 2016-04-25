public class GuessMee
{
  public static void main(String[] args )
  {
    int xx = 0;
     do {
       xx = xx + xx + 1;
       System.out.println(xx + " \t" + GuessMe.fn20(xx));
       } while (xx>0);
  }
}
