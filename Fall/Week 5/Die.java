import java.util.*;

public class Die
{
    private int faceValue;
    private final int MAX = 6;
    
      public Die() {
        faceValue = 1;
      }
      
      public void roll() {
        faceValue = (int) (Math.random() * MAX) + 1;
      }
      
      public int getFaceValue() {
        return faceValue;
      }
    }