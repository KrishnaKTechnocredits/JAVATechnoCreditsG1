package amarja;
//Program to find addition,subtraction,multiplication and division of two numbers
public class CalculatorProg {
		public static void main(String[] args) {
		CalculatorProg a = new CalculatorProg();
		System.out.println("Number 1= "+ Integer.parseInt(args[0]));
		System.out.println("Number 2= "+ Integer.parseInt(args[1]));
		a.addition(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		a.subtraction(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		a.multiplication(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		a.division(Float.parseFloat(args[0]),Float.parseFloat(args[1]));
	}
		void addition (int num1,int num2)
			{  
			System.out.println ("Addition = " + (num1+num2));
			}
		void subtraction(int num1,int num2)
	 		{
			System.out.println ("Subtraction = " + (num1-num2));
	 		}	
		void multiplication(int num1,int num2)
		{
			System.out.println ("Multiplication = " + (num1*num2));
		}
	    void division(float num1,float num2)
		{
	    	System.out.println ("Division = " + (num1/num2));
		}
	}


