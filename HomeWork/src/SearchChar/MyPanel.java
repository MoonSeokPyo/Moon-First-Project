package SearchChar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements KeyListener{
	private JTextField txt;
	public String[] str;
	public int n = 0;		// str ũ��
	//LinkedList head;
	public JLabel l;
	
	public MyPanel() {
		//head = null;
		txt = new JTextField(25);
		setLayout(new GridLayout(0,2));
		add(new JLabel("���ڿ��� �Է��Ͻÿ�(���ڸ� �����մϴ�) : "));
		add(txt);
		txt.addKeyListener(this);
		
		Font f_1 = new Font("Dialog", Font.BOLD, 15);
		l = new JLabel("���ڰ� �Էµ��� �ʾҽ��ϴ�.");
		l.setHorizontalAlignment(JLabel.CENTER);
		l.setOpaque(true); 	// ���� �ٲܷ��� �ؾ��ѵ�
        l.setBackground(Color.decode("#97BC62"));
        l.setForeground(Color.decode("#2C5F2D"));
        l.setFont(f_1);
	}
	
//	class LinkedList{
//		char ch_data;
//		LinkedList link;
//		LinkedList(char c){
//			ch_data = c;
//			link = null;
//		}
//		LinkedList(char c, LinkedList l){
//			ch_data = c;
//			link = l;
//		}
//	}
	
//	void List(char c) {
//		if(head == null) {
//			head = new LinkedList(c);
//		}
//		else {
//			LinkedList node = head;
//			while(node.link != null) {
//				node = node.link;
//			}
//			node.link = new LinkedList(c);
//		}
//	}
//	int Size() {
//		int size = 0;
//		if(head != null) {
//			LinkedList node = head;
//			while(node != null) {
//				node = node.link;
//				size++;
//			}
//		}
//		return size; 
//	}
//	char rech() {
//		LinkedList node = head;
//		char c = node.ch_data;
//		head = node.link;
//		node = null;
//		// node ���� �����ؾ� �ϴµ�....
//		return c;
//	}
	// 32~126
	// 48~57 ����
	// 13����
	
	//e.getKeyChar() : ���� Ű�� ���ڸ� ����

	//e.getKeyCode() : ���� Ű�� �ƽ�Ű�ڵ带 ����

	//e.getModifiers() : Shift, Ctrl, AltŰ �ν� ���� 1,2,8 ����
	
	// ���ڸ� ������ �� ȣ��, ����Ű���� �����մϴ�.
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
//		char ch = e.getKeyChar();
//		List(ch);
	}

	// Ű���带 ���� �� ȣ��, ��� Ű���忡 �����մϴ�.
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 10) {		// enter �Է��̸�
			
			String GetStr = txt.getText();
			char[] c = new char[GetStr.length()];
			for(int i = 0; i < GetStr.length(); i++) {
				c[i] = GetStr.charAt(i);
			}
			
			
//			for(int i = 0; i < c.length; i++) {
//				c[i] = rech();
//			}
			
			for(int i = 0; i < c.length; i++) {
				if(c[i] >= 48 && c[i] <= 57) {
					n++;
					if( i-1 >= 0 && (c[i] >= 48 && c[i] <= 57) && (c[i - 1] >= 48 && c[i - 1] <= 57)) {
						n--;
					}
//					if( i+1 < c.length && (c[i + 1] < 48 || c[i + 1] > 57)) {
//						n++;
//					}
				}
			}
			str = new String[n];
			int start = 0;
			loop:for (int i = 0; i < n; i++) {
				str[i] = "";
				for(int j = start; j < c.length; j++) {
					start++;
					if(c[j] >= 48 && c[j] <= 57) {
						str[i] += c[j];
						if( j+1 < c.length && (c[j + 1] < 48 || c[j + 1] > 57)) {
							continue loop;
						}
					}
				}
			}
			if(n != 0) {
				l.setText(str[0] + "�� �� ó�� ���� �Դϴ�.");
			}
		}
	}

	// Ű���带 ������ �� ȣ��, ��� Ű���忡 �����մϴ�.
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

