package Ex09;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
	public MyWindow() {
		setTitle("첫 윈도우 프로그램");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("내 이름은 홍길동 입니다."));
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setPreferredSize(new Dimension(300, 150));
		
		pack();
		setVisible(true);
	}
}
