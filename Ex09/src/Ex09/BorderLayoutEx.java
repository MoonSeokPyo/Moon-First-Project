package Ex09;

import javax.swing.*;
import java.awt.*;


public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("Hello Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.ORANGE);
		JTextField t1 = new JTextField(20);
		JButton b1 = new JButton("확인");
		JLabel l1 = new JLabel("Hello");
		
		c.add(t1, BorderLayout.CENTER);
		c.add(b1, BorderLayout.EAST);
		c.add(l1, BorderLayout.SOUTH);
		
		
		
		
		// c.setLayout(new BorderLayout(30, 20));
		
		//c.add(new JTextField(20), BorderLayout.WEST);
		//c.add(new JButton("확인"), BorderLayout.EAST);
		//c.add(new Content("Hello"), BorderLayout.SOUTH);
		
		// setPreferredSize(new Dimension(300, 150));
		
		pack();
		setVisible(true);
	}
}
