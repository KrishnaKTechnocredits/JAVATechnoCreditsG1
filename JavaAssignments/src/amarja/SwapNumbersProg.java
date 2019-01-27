package amarja;
//Program to swap 2 whole numbers without variable
public class SwapNumbersProg {
	public static void main(String [] args)
	{
		 SwapNumbersProg a = new SwapNumbersProg();
		a.swapnumber(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
	void swapnumber(int num1,int num2)
	{
		System.out.println("***Before Swapping***");
		System.out.println("Number 1  = "+ num1);
		System.out.println("Number 2  = "+ num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("***After Swapping***");
		System.out.println("Swapped Number 1 = "+ num1);
		System.out.println("Swapped Number 2 = "+ num2);
	}
}

