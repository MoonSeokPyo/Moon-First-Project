package firstJava;

public class Total {
	
	public static void main(String[] args) {
	int total=0;
	for(int cnt=0; cnt < 200; cnt++) {
		total += cnt;
		//System.out.println(cnt);
	}
	System.out.println(total);
	}
}
