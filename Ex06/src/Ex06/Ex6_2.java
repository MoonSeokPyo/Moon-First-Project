package Ex06;

public class Ex6_2 {
	String _name;
	int _age;

	public boolean equals(Object obj) {
		Cat c1 = (Cat)obj;
		return _name.equals(c1._name) && _age == c1._age;
	}
	public static void main(String[] args) {
		Cat thief = new Cat("����", 3);
		Cat black = new Cat("����", 3);
		if (thief.equals(black))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
	}
}
