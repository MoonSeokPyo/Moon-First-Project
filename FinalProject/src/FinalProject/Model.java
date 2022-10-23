package FinalProject;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
import java.util.*;


import java.io.File;
import javax.sound.sampled.*;

public class Model {
	int _count=0;				// �̹��� ��ü Ƚ��
	int _score=10000;			// ����
	public int _clickcount=0;	// Ŭ�� Ƚ��
	
	long starttime;				// ���� �ð�
	long finishTime;			// ���� �ð�
    long elapsedTime;			// ���� �ð� - ���� �ð� 
	
    public int _num;			// numxnum
    public int _gamecheck=0;	// ���� ����
	public int _shuffle[];		// ���� ����
	public int _answer[];		// ���� ����
	public int _shufflememory;	// ���� ���� ���
	public int _temp;			// �̹��� ��ü�� ���� temp ����
	
	Random _randnum = new Random();
	
	public Model() {
		
	}
	
	void music() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Music\\sample2.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);				
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			clip.start();		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void shuffle(int n) {
		_shuffle = new int[n*n];
		_answer = new int[n*n];
		for (int i = 0; i<n*n; i++) {
			_shuffle[i]=_randnum.nextInt(n*n);
			for(int j=0; j<i; j++) {
				if(_shuffle[j]==_shuffle[i]) {
					i--;
				}	
			}
			_answer[i]=i;
		}
		if(_answer==_shuffle) {
			shuffle(n);
		}
	}
	
	void score(GamePanel gamepanel) {
		elapsedTime = finishTime - starttime;
		_score=_score-((_count*50)+((int)(elapsedTime/1000)*10));
		if(_score < 1) {
			_score=1;
		}
		//System.out.println("������ : " + _score + " / 10000 �� �Դϴ�.");
		//System.out.println("�� �̹��� ��ü Ƚ���� : " + _count + "�� �Դϴ�.");
		//System.out.println("�� �� �ɸ� �ð��� : " + elapsedTime +" (" + elapsedTime/1000 + "��) �Դϴ�.");
		gamepanel.text.setText("������ " + _score + "�� �Դϴ�. �̹����� " + _count + "�� ��ü�߰� " + elapsedTime/1000 + "�� �ɷȽ��ϴ�.");
		
	}
}
