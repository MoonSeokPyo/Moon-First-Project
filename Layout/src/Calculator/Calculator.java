package Calculator;

import java.awt.*;
import java.util.Iterator;

import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JPanel;

public class Calculator extends JFrame {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = {
		"backspace", "", "", "CE", "C",
		"7", "8", "9", "/", "sqrt",
		"4", "5", "6", "x", "%",
		"1", "2", "3", "-", "1/x",
		"0", "+/-", ".", "+", "=",
	};
	public Calculator() {
		tField = new JTextField(35);
		panel = new JPanel();
		tField.setText("0.");
		tField.setEnabled(false);
		
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if(cols >= 3) {
					buttons[index].setForeground(Color.red);
				}
				else {
					buttons[index].setForeground(Color.blue);
				}
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("계산기");
		pack();
		// 사이즈 지정을 안해서 공간이 남으면 꽉차게 조정함
	}
}
