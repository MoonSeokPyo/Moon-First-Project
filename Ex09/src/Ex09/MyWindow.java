package Ex09;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
	public MyWindow() {
		setTitle("ù ������ ���α׷�");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("�� �̸��� ȫ�浿 �Դϴ�."));
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setPreferredSize(new Dimension(300, 150));
		
		pack();
		setVisible(true);
	}
}
