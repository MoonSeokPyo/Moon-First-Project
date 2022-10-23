package firstJava;
import java.util.Scanner;
public class Ex2_3 {
	public static void main(String[] args) {
		System.out.println("What's your age?");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		scanner.close();
		int nextage;
		nextage = age + 1;
		System.out.println("You will be "+nextage+" next year.\n");
	}
}