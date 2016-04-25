
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NestedPanels {
 public static void main(String[] args) {
  JFrame frame = new JFrame("nested panels");
  frame.setVisible(true);
  frame.setSize(1000,500);
  
  
 
  
  // create the first panel and a label
  JPanel subPanel_1 = new JPanel();
  JLabel label_1 = new JLabel("Hello");
  subPanel_1.add(label_1);
  subPanel_1.setForeground(Color.blue);
  
  JButton button1 = new JButton("Press Here!");
  if (button1 = 
  button1.addActionListener(new ActionListener() {
	  public void actionPerformed(ActionEvent e) {
		  frame.dispose();
	  }
  
	  
 
  JPanel subPanel_2 = new JPanel();
  JLabel label_2 = new JLabel("Worlds");
  subPanel_2.add(label_2);
  
  JPanel primary = new JPanel();
  primary.add(button1);
  primary.add(subPanel_1);
  primary.add(subPanel_2);

  frame.getContentPane().add(primary);
  
  
 }



}