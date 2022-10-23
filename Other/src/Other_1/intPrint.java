package Other_1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class intPrint extends JFrame implements ActionListener{
   JButton right,left;
   JPanel panel;
   JTextArea input;
   JTextField output;
   int i;
   
   public intPrint() {
	  i = 0;
      setSize(500,300);
      setTitle("Print Int");
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      panel = new JPanel();
      panel.setLayout(new GridLayout(0,2));
      
      input = new JTextArea();
      output = new JTextField(10);
      
      right = new JButton("> right");
      left = new JButton("< left");
      
      right.addActionListener(this);//이벤트메소드호출
      left.addActionListener(this);//이벤트메소드호출
      
      panel.add(left);
      panel.add(right);
      
      
      add(input, BorderLayout.NORTH);
      add(output, BorderLayout.CENTER);
      add(panel, BorderLayout.SOUTH);
      setVisible(true);
   }
   
   public static boolean right(int i, int n) {
       if(i==n) {
           return false; 
        }
       else
          return true;
   }
   
   public static boolean left(int i, int n) {
      if(i<0) {
         return false;
      }
      else 
         return true;
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      
      String str = input.getText();
      
      String intStr = str.replaceAll("[^0-9]", " ");
      
//      String[] strArray = new String[50];
//      strArray = intStr.split("\\s+");
      
      String[] strArray = intStr.split("\\s+");
     
      System.out.println(strArray[0]);
      System.out.println(strArray[1]);
      System.out.println(strArray[2]);
      System.out.println(strArray.length);
      
      
      int n = strArray.length; 
      
    
      if(e.getSource()==right) {
        
         if(right(i+1, n) == false) {
        	 
            output.setText("Nothing!!");
         }   
         else
        	i++;
            output.setText(strArray[i]);
      }
      else if(e.getSource()==left) {
         
         if(left(i-1, n) == false) {
            output.setText("Nothing!!");
         }   
         else
        	i--;
            output.setText(strArray[i]);
      }
   }
   public static void main(String[] args) {
      new intPrint();
   }
}