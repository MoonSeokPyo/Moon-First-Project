package Ex06;

public class Ex6_3 {
	public static void main(String[] args) {
		// ���ڿ��� ������ ��ȯ�Ϸ���?
		String str_1 = "314";
		int i_1;
		i_1 = Integer.parseInt(str_1);
		System.out.println(i_1);
		// ���ڿ��� �Ǽ��� ��ȯ�Ϸ���?
		String str_2 = "31.4";
		double d_2;
		d_2 = Double.parseDouble(str_2);
		System.out.println(d_2);
		// ������ ���ڿ��� ��ȯ�Ϸ���?
		int i_3 = 345;
		String str_3;
		str_3 = Integer.toString(i_3);
		System.out.println(str_3);
		// �Ǽ��� ���ڿ��� ��ȯ�Ϸ���?
		double d_4 = 3.45;
		String str_4;
		str_4 = Double.toString(d_4);
		System.out.println(str_4);
	}
}
