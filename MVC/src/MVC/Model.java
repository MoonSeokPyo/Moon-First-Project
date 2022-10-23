package MVC;

public class Model {
	int _a, _b;
	void setAB(int a,int b) {
		_a=a;
		_b=b;
	}
	int getA() {
		return _a;
	}
	int getB() {
		return _b;
	}
	int getSum() {
		return _a+_b;
	}
	int getSub() {
		return _a-_b;
	}
}
