package day0518;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelEx extends JFrame {
	public PanelEx() {
		setTitle("덧셈 프로그램");
		
		Container contentPane = getContentPane();
		
		JPanel panel1 = new JPanel();
		
		// panel1.setLayout(new FlowLayout());
		// JPanel의 디폴드 배치관리자가 FlowLayout 이다.
		
		JTextField t1 = new JTextField("10");
		t1.setPreferredSize(new Dimension(100, 50));
		JTextField t2 = new JTextField("20");
		t2.setPreferredSize(new Dimension(100, 50));
		JTextField t3 = new JTextField("  ");
		t3.setPreferredSize(new Dimension(100, 50));
		t3.setEditable(false);
		panel1.add(t1);
		panel1.add(new JLabel("+"));
		panel1.add(t2);
		panel1.add(new JLabel("="));
		panel1.add(t3);
		
		JPanel panel2 = new JPanel();
		// panel2.setLayout(new FlowLayout());
		JButton b1 = new JButton("확인");
		b1.setPreferredSize(new Dimension(100, 50));
		panel2.add(b1);
		
		//ActionListener btn1Action = new Button1ActionListener(t1, t2, t3);
		ActionListener btn1Action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1 = t1.getText();
				String str2 = t2.getText();
				int num3 = Integer.parseInt(str1) + Integer.parseUnsignedInt(str2);
				t3.setText(new Integer(num3).toString());
			}
		};
		
		/////////////////////////////////////////
		b1.addActionListener(btn1Action);
		
		JButton b2 = new JButton("취소");
		b2.setPreferredSize(new Dimension(100, 50));
		panel2.add(b2);
		
		contentPane.add(panel1,BorderLayout.CENTER);
		contentPane.add(panel2,BorderLayout.SOUTH);
		
		
		//setPreferredSize(new Dimension(500, 500));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}