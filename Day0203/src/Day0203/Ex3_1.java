package Day0203;

public class Ex3_1 {
	public static void main(String[]args) {
		for (int i=0; i<5; i++) {
			char c='A';
			c = (char) (c+i);
			for(int j=i; j<5; j++) {
				System.out.print(c);
				c = (char) (c+1);
			}
			System.out.println();
		}
	}
}
