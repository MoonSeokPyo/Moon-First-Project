package NumberBaseball;

import java.util.Random;
import java.util.Scanner;

// import java.util.*;
// 앞으로는 이걸로 다 불러오자;;;

public class NumberBaseball {
	
	public static void main(String[]args) {
		
		int randnum[] = new int[3];	// 랜덤 숫자
		int num[] = new int[3]; 	// 입력숫자
		int count=0;		// 도전 횟수
		int ball;			// 볼 횟수
		int strike;		// 스트라이크 횟수
		
		Random number = new Random();
		for (int i=0; i<3; i++) // 랜덤 숫자 생성
		{ 
			randnum[i]=number.nextInt(9) + 1;
			System.out.println("----- i=" + i + " -----");
			System.out.println(randnum[i]);
			for (int j=0; j < i; j++) //중복을 걸러내기 위한 반복문 
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