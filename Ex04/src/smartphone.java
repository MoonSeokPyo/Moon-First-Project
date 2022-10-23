
public class smartphone {
	String _modelName;
	String _color;
	int _cameranumber;
	int _num;
	
	public smartphone() {
		System.out.println("smartphone °´Ã¼°¡(»ý¼ºµÊ)");
	}
	
	public smartphone(int num) {
		this._num = num;
	}
	
	public smartphone(String name, String color, int number) {
		_modelName=name;
		_color=color;
		_cameranumber=number;
	}
	
	public void pictur() {
		System.out.println("take a pictur.");
	}
	public void call() {
		System.out.println("make a phone call.");
	}
	public void charge() {
		System.out.println("charge up.");
	}
	public void game() {
		System.out.println("play game.");
	}
	
}
