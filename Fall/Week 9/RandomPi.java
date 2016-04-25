import javax.swing.JOptionPane;
public class RandomPi{
  public static void main(String[] args){
    int trials = 0;
    int inside = 0;
    String str = JOptionPane.showInputDialog("Enter number of trials");
    trials = Integer.parseInt(str);
    double x, y;
    for(int j = 0; j < trials; j++){
      x = Math.random();
      y = Math.random();
      if ((x*x + y*y) < 1.0) 
        inside++;
    }
    JOptionPane.showMessageDialog(null, "pi guess: " + (double)(4*inside)/trials);
  }
}