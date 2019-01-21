package vishal;

class MathOperations {
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public int mult(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public int div(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}

	public int remainder(int num1, int num2) {
		int result = num1 % num2;
		return result;
	}

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		MathOperations mo = new MathOperations();
		int add = mo.add(num1, num2);
		int sub = mo.sub(num1, num2);
		int mult = mo.mult(num1, num2);
		int div = mo.div(num1, num2);
		int remain = mo.remainder(num1, num2);

		System.out.println("Addition is " + add);
		System.out.println("Substraction is " + sub);
		System.out.println("Multipication is " + mult);
		System.out.println("Division is " + div);
		System.out.println("Remainder is " + remain);
	}

}
