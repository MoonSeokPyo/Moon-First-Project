package Ex09;

import javax.swing.*;
import java.awt.*;

public class PanelEx extends JFrame {
	public PanelEx() {
		setTitle("µ¡¼À ÇÁ·Î±×·¥");
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		
		JPanel panel1 = new JPanel();
		JTextField t1 = new JTextField(5);
		JTextField t2 = new JTextField(5);
		JTextField t3 = new JTextField(6);
		panel1.add(t1);
		panel1.add(new JLabel("+"));
		panel1.add(t2);
		panel1.add(new JLabel("="));
		panel1.add(t3);
		
		JPanel panel2 = new JPanel();
		JButton b1 = new JButton("È®ÀÎ");
		JButton b2 = new JButton("Ãë¼Ò");
		panel2.add(b1);
		panel2.add(b2);
		
		contentPane.add(panel1,BorderLayout.CENTER);
		contentPane.add(panel2,BorderLayout.SOUTH);
		
		
//		contentPane.setPreferredSize(new Dimension(250, 150));
//		contentPane.setLocation(500,400);
//		
//		JPanel panel = new JPanel();
//		panel.setLayout(new GridLayout(3,2));
//		
//		JTextField t1 = new JTextField();
//		JTextField t2 = new JTextField();
//		JLabel l1 = new JLabel(" + ");
		
		setPreferredSize(new Dimension(300, 150));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}
