
public class Ex4_7 {
	public static void main(String[] args) { 
		Cat Cats[] = new Cat[3];
		for(int i=0; i < Cats.length; ++i) {
			Cats[i] = new Cat();
		}
		
		Cat.printPopulation();
		Cat black = new Cat();
		Cat white = new Cat();
		Cat.printPopulation();
		System.out.println("³ªÀÌ : " + Cats[0]._age);
		Cat.speak();
	}
}
