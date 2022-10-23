package day0518;

import java.awt.event.*;
import javax.swing.*;

public class Button1ActionListener implements ActionListener {
	JTextField _t1;
	JTextField _t2;
	JTextField _t3;
	
	public Button1ActionListener(JTextField t1, JTextField t2, JTextField t3) {
		_t1 = t1;
		_t2 = t2;
		_t3 = t3;
	}
	public void actionPerformed(ActionEvent e) {
		String str1 = _t1.getText();
		String str2 = _t2.getText();
		int num3 = Integer.parseInt(str1) + Integer.parseUnsignedInt(str2);
		_t3.setText(new Integer(num3).toString());
	}
}
