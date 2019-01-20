package rahulV;

public class Assignment1_Q1 {  

	int sum(int num1, int num2) {   //Addition

		// int sum = num1+num2;
		return num1 + num2;
	}

	int sub(int num1, int num2) {   //substraction

		// int sub = num1-num2;
		return num1 - num2;
	}

	int mul(int num1, int num2) {   //multiplication

		// int mul = num1*num2;
		return num1 * num2;
	}

	int div(int num1, int num2) {   //division

		//int div = num1 / num2;
		return num1 / num2;
	}

	int rem(int num1, int num2) {   //reminder

		// int rem = num1%num2;
		return num1 % num2;
	}

	public static void main(String[] args) {
		Assignment1_Q1 s = new Assignment1_Q1();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sub(30, 10));
		System.out.println(s.mul(5, 10));
		System.out.println(s.div(50, 10));
		System.out.println(s.rem(41, 8));

	}

}
