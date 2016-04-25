import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Frames {
  public static void main(String[] args) {

JFrame frame = new JFrame("Nested Panels");
frame.setVisible(true);
frame.setSize(200,200);

      // create the first panel and a label
      JPanel subPanel_1 = new JPanel();
      JLabel label_1 = new JLabel("Hello");
      subPanel_1.add(label_1);
       subPanel_1.setSize(200,200);
    subPanel_1.setVisible(true);
  

      // create the second panel and a label
      JPanel subPanel_2 = new JPanel();
      JLabel label_2 = new JLabel("World");
      subPanel_2.add(label_2);
       subPanel_2.setSize(200,200);
    subPanel_2.setVisible(true);
  
      
  }
}