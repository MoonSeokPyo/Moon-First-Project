package firstJava;

public class Ex2_5 {
	public static void main(String[] args) {
		for(int i= 1; i<=100; i++) {
			System.out.printf("%d ", i-1);
			if((i%10)==0) {
				System.out.println("\n");
			}
		}
	}
}