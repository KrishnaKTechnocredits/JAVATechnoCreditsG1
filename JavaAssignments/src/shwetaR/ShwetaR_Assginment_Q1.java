package shwetaR;

public class ShwetaR_Assginment_Q1
{

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int additionOfAll = addition(a, b) + substraction(a, b) + multipication(a, b) + division(a, b)
				+ remainder(a, b);
		System.out.println(additionOfAll);
	}

	static int addition(int a, int b) {
		int x = a + b; //30
		return x;
	}

	static int substraction(int a, int b) {
		int x = a - b; //10
		return x;
	}

	static int multipication(int a, int b) {
		int x = a * b; //200
		return x;
	}

	static int division(int a, int b) {
		int x = a / b; //2
		return x;
	}

	static int remainder(int a, int b) {
		int x = a % b; //0
		return x;

	}
}
