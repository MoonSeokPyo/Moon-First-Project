package Event_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	private boolean clicked;
	public MyFrame() {
		clicked = false;
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
	private class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == button) {
				label.setText("��ħ�� ��ư�� ���������ϴ�.");
			}
			
		}
		
	}
}
