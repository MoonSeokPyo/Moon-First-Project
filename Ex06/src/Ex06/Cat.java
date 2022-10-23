package Ex06;

public class Cat {
	String _name;
	int _age;
	public Cat(String name, int age){
		_name = name;
		_age = age;
	}
	@Override
	public String toString() {
		return _name + " 고양이 (" + _age + "살)";
	}
	public boolean equals(Object obj) {
		Cat c1 = (Cat)obj;
		return _name.equals(c1._name) && _age == c1._age;
	}
	public static void main(String[] args) {
		Cat thief = new Cat("도둑", 3);
		Cat black = new Cat("도둑", 3);
		if (thief.equals(black))
			System.out.println("같음");
		else
			System.out.println("다름");
	}
}
