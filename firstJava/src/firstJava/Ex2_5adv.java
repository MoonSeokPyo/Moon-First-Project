package firstJava;

public class Ex2_5adv {
	public static void main(String[] args) {
		int a = 9;
		for(int i= 0; i<100; i++) {
			System.out.printf("%d ", i);
			if(i==a) {
				System.out.println("\n");
				a += 10;
			}
		}
	}
}
