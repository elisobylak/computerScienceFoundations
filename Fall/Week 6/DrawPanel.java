/**
 * Creates a frame and draws a circle and a line
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Random;
import java.awt.*;

public class DrawPanel extends JPanel{
  
  private Color colors[] =
  { Color.WHITE, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };
 
  
  public DrawPanel () {
    setPreferredSize(new Dimension(1000, 1000));
     this.setBackground(Color.black);
  }
  
  
  public void paintComponent(Graphics page) {
    super.paintComponent(page);
    
    
    for(int b = 0 ,  x = 6;  b<500 ; b+=3 , x+=2) {
      page.setColor(colors[(int)(Math.random()*6)]);
      page.drawArc(b + 150, x, 100, b^x, b, 360);
    }
    
    for(int c = 0;  c<500 ; c+=1) {
    page.setColor(colors[(int)(Math.random()*6)]);
    page.fillRoundRect(0,200,c^c-1,c^c-1,c*c,c*c);
  }
 }
}