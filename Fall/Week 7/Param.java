public class Param
{
  public static void main(String[] args)
  {
    int q = x;
    int y = add1(q);
    int x = y;
    System.out.println(x);
  }
  
  static int add1(int x) {
    x += 1;
    return x;
  }

}