package Other_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class blank extends JFrame implements ActionListener {
	private int o_count, x_count;
	private boolean full, x_win, o_win;
	private int blank;
	private int n = 3;		// 칸 설정
	private JTextField txt;
	private JPanel p;
	JButton[][] buttons = new JButton[n][n];
	private char turn = 'X';

	public blank() {
		x_win = false;
		o_win = false;
		txt = new JTextField(/* 값을 넣어서 크기지정 가능 */);
		txt.setEnabled(false);
		txt.setDisabledTextColor(Color.BLACK);
		txt.setText("게임을 시작합니다. " + turn + "턴");
		p = new JPanel(/* 값을 넣어서 크기지정 가능 */);
		p.setLayout(new GridLayout(n, n, 5, 5));
		Font f = new Font("Dialog", Font.ITALIC, 25);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				buttons[i][j] = new JButton(" ");
				buttons[i][j].setFont(f);
				buttons[i][j].addActionListener(this);
				p.add(buttons[i][j]);
			}
		}
		add(p, BorderLayout.CENTER);
		add(txt, BorderLayout.SOUTH);
		// pack(); 크기를 딱맞게 조절해줌
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100, 800);
		setLocation(500, 200);
		setTitle("TIC-TAC-TOE");
		setVisible(true);
	}

	boolean CheckGame() {
		// 승자 체크
		// 가로
		for (int i = 0; i < n; i++) {
			o_count = 0;
			x_count = 0;
			for (int j = 0; j < n; j++) {
				if (buttons[i][j].getText().equals("X") == true) {
					x_count++;
					o_count = 0;
				}
				else if (buttons[i][j].getText().equals("O") == true) {
					o_count++;
					x_count = 0;
				}
				else if(buttons[i][j].getText().equals(" ") == true) {
					o_count = 0;
					x_count = 0;
				}

				if (Check()) {
					return true;
				}
			}
		}
		// 세로
		for (int i = 0; i < n; i++) {
			o_count = 0;
			x_count = 0;
			for (int j = 0; j < n; j++) {
				if (buttons[j][i].getText().equals("X") == true) {
					x_count++;
					o_count = 0;
				}
				else if (buttons[j][i].getText().equals("O") == true) {
					o_count++;
					x_count = 0;
				}
				else if(buttons[i][j].getText().equals(" ") == true) {
					o_count = 0;
					x_count = 0;
				}

				if (Check()) {
					return true;
				}
			}
		}
		///////////////////////////////// 대각선
		int x;
		/////////////////////////////////// 대각선 위
		
		o_count = 0;
		x_count = 0;
		x = 0;
		for (int y = n - 1; y >= 0; y--) {
			if (buttons[x][y].getText().equals("X") == true) {
				x_count++;
			}
			else if (buttons[x][y].getText().equals("O") == true) {
				o_count++;
			}

			if (Check()) {
				return true;
			}

			if (x + 1 < n) {
				x++;
			}
			else {
				break;
			}
		}
		////////////////////////////////////////////// 대각선 아래

			o_count = 0;
			x_count = 0;
			x = 0;
			for(int j = 0; j < n; j++) {
				if(buttons[x][j].getText().equals("X") == true) {
					x_count++;
				}
				else if(buttons[x][j].getText().equals("O") == true) {
					o_count++;
				}
				
				if(Check()) {
					return true;
				}
				
				if(0 <= x + 1 && x + 1 <= n) {
					x++;
				}
				else {
					
					break;
				}
			}

		//////////////////////////////////////// 공간 확인
		blank = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (buttons[i][j].getText().equals(" ") == true) {
					blank++;
				}
			}
		}
		if (blank == 0) {
			full = true;
			return true;
		}

		return false;
	}

	boolean Check() {
		// 승자 확인
		
		if (x_count == n) {
			x_win = true;
			return true;
		}
		else if(o_count == n) {
			o_win = true;
			return true;
		}
			
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (e.getSource() == buttons[i][j] && buttons[i][j].getText().equals(" ") == true) {
					if (turn == 'X') {
						buttons[i][j].setText("X");
						turn = 'O';
					} else {
						buttons[i][j].setText("O");
						turn = 'X';
					}
				}
			}
		}
		txt.setText("게임 중... " + turn + "턴");
		if (CheckGame()) {
			if (x_win) {
				txt.setText("게임 종료 X 승리");
			} else if (o_win) {
				txt.setText("게임 종료 O 승리");
			} else if (full) {
				txt.setText("공간 꽉 참 게임 종료 무승부");
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					this.buttons[i][j].setEnabled(false);
				}
			}
		}
	}
	public static void main(String[] args) {
		new blank();
	}
}
