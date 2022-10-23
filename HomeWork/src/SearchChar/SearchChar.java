package SearchChar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchChar extends JFrame implements ActionListener {
	private MyPanel p_1;
	private JPanel p_2;
//	public JLabel l;
	private JButton btn_1, btn_2;
	private int num;
	public SearchChar(){
		num = 0;
		p_1 = new MyPanel();
		p_2 = new JPanel();
//		Font f_1 = new Font("Dialog", Font.BOLD, 15);
		Font f_2 = new Font("Dialog", Font.ITALIC, 30);
//		l = new JLabel("문자가 입력되지 않았습니다.");
//		l.setHorizontalAlignment(JLabel.CENTER);
//		l.setOpaque(true); 
//        l.setBackground(Color.decode("#97BC62"));
//        l.setForeground(Color.decode("#2C5F2D"));
//        l.setFont(f_1);
		
		btn_1 = new JButton("<");
		btn_1.setSize(30, 30);
		btn_2 = new JButton(">");
		btn_2.setSize(30, 30);
		
		btn_1.setFont(f_2);
		btn_2.setFont(f_2);
		btn_1.addActionListener(this);
		btn_2.addActionListener(this);
		
		p_2.setLayout(new BorderLayout());
		p_2.add(btn_1, BorderLayout.WEST);
		p_2.add(btn_2, BorderLayout.EAST);
		p_2.add(p_1.l, BorderLayout.CENTER);
		setLayout(new BorderLayout());
		add(p_1, BorderLayout.NORTH);
		add(p_2, BorderLayout.SOUTH);
		
		//setSize(500, 500);
		pack();
		//setPreferredSize(new Dimension(200,100));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500, 200);
		setTitle("SearchChar");
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn_1) {
			if(p_1.n != 0) {
				if(num - 1 < 0) {
					p_1.l.setText(p_1.str[num] + "이 맨 처음 숫자 입니다.");
				}
				else{
					if(num - 2 < 0) {
						p_1.l.setText(p_1.str[--num] + "이 맨 처음 숫자 입니다.");
					}
					else {
						p_1.l.setText(p_1.str[--num]);
					}
				}
			}
		}
		else if(e.getSource() == btn_2) {
			if(p_1.n != 0) {
				if(num + 1 >= p_1.n) {
					p_1.l.setText(p_1.str[num] + "이 맨 마지막 숫자 입니다.");
				}
				else{
					if(num + 2 >= p_1.n) {
						p_1.l.setText(p_1.str[++num] + "이 맨 마지막 숫자 입니다.");
					}
					else {
						p_1.l.setText(p_1.str[++num]);
					}
				}
			}
		}
		
	}
}
// Scanner 혹은 inputstream 사용해서 키 받아내고
// key 이벤트 이용하면 가능할것 같다.
// #2C5F2D 글자 색상 코드