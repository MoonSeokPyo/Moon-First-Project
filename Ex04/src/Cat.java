
public class Cat {
	int _age;
	String _name;
	static int _population; // = 0���� �ʱ�ȭ ���ص� ������?
	
	
	public Cat(){
//		System.out.println("a cat born!");
//		++_population;
		this(0,"");
	}
	public Cat(int age){
//		System.out.println("a cat born!");
//		this._age = age;
//		++_population;
		this(age,"");
	}
	public Cat(int age, String name){
//		System.out.println("a cat born!");
//		this._age = age;
//		this._name = name;
//		++_population;
		System.out.println("a cat born!");
		_age = age;
		_name = name;
		++_population;
	}
	
	static void speak() {
		System.out.println("�߿� ! ");
	}
	
	static void printPopulation () {
		System.out.println("����� �� : " + _population);
	}
}
