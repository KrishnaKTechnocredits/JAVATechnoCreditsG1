package mayur;

public class SwapNumbers {

	public static void main(String args[]) 
	{
		float Num1 = Float.parseFloat(args[0]);
		float Num2 = Float.parseFloat(args[1]);
		SwapNumbers s = new SwapNumbers();
		System.out.println("Numbers before swaping: Number1 =" + Num1 + " and Number2 =" + Num2);
		s.swap(Num1, Num2);
	}

	void swap(float a, float b) {
		float temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Numbers after swaping: Number1 =" + a + " and Number2 =" + b);
	}
}
