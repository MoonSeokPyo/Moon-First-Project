package Day0203;

import java.util.Scanner;

public class Ex3_3 {
	public static int sum(int n) {
		int a=0;
		for	(int i = 0; i <= n; i++) {
			a += i; 
		}
		return a;
	}
	public static void main(String[]args) {
		System.out.print("Input number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("1���� "+num+"������ �հ��"+sum(num)+"�Դϴ�.");
		input.close();
	}
}
