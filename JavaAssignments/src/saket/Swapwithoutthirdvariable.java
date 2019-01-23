package saket;

public class Swapwithoutthirdvariable {

	float a = 5.0f;
	float b = 7.0f;

	void logic() {
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("a is" + a);
		System.out.println("b is " + b);
	}

	public static void main(String[] args) {

		Swapwithoutthirdvariable A = new Swapwithoutthirdvariable();
		A.logic();

	}

}
