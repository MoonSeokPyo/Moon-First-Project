package NumberBaseball;

import java.util.Random;
import java.util.Scanner;

// import java.util.*;
// �����δ� �̰ɷ� �� �ҷ�����;;;

public class NumberBaseball {
	
	public static void main(String[]args) {
		
		int randnum[] = new int[3];	// ���� ����
		int num[] = new int[3]; 	// �Է¼���
		int count=0;		// ���� Ƚ��
		int ball;			// �� Ƚ��
		int strike;		// ��Ʈ����ũ Ƚ��
		
		Random number = new Random();
		for (int i=0; i<3; i++) // ���� ���� ����
		{ 
			randnum[i]=number.nextInt(9) + 1;
			System.out.println("----- i=" + i + " -----");
			System.out.println(randnum[i]);
			for (int j=0; j < i; j++) //�ߺ��� �ɷ����� ���� �ݺ��� 
			{
				if(randnum[i]==randnum[j])
					i--;
			}
		}
		
		System.out.println("=============");
		
		System.out.println("[Number Baseball]");
		System.out.println("-----------------");
		System.out.println("Guess 3 numbers.");
		
		
		Scanner input = new Scanner(System.in);
		while(true)
		{
			strike=0;
			ball=0;
			
			for(int i=0; i<3; i++)
			{
				num[i]= input.nextInt();
			}
			for (int i=0; i<3; i++)
			{
				if(randnum[i]==num[i])
					strike++;
				for (int j=0; j<3; j++)
				{
					if(i!= j)
						if(randnum[i]==num[j])
							ball++;
						
				}
			}
			count++;
			if(strike < 3)
			System.out.println(strike + " strike, " + ball + " ball");
			else {
				System.out.println(strike + " strike.");
				break;
			}
		}
		System.out.println("You make it on " + count + " tries.");
		input.close();
	}
}