package Ex06;

public class Ex6_3 {
	public static void main(String[] args) {
		// 문자열을 정수로 변환하려면?
		String str_1 = "314";
		int i_1;
		i_1 = Integer.parseInt(str_1);
		System.out.println(i_1);
		// 문자열을 실수로 변환하려면?
		String str_2 = "31.4";
		double d_2;
		d_2 = Double.parseDouble(str_2);
		System.out.println(d_2);
		// 정수를 문자열로 변환하려면?
		int i_3 = 345;
		String str_3;
		str_3 = Integer.toString(i_3);
		System.out.println(str_3);
		// 실수를 문자열로 변환하려면?
		double d_4 = 3.45;
		String str_4;
		str_4 = Double.toString(d_4);
		System.out.println(str_4);
	}
}
