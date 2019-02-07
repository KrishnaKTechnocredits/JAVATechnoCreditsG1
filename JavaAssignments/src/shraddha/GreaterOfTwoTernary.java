//-------------------------------------------------------------------
//Assignment: Find greater of two numbers using ternary operator.
//-------------------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class GreaterOfTwoTernary {

	void greaterOfTwoTernary(int num1, int num2)
	{
		String result = (num1>num2)?"Num1 is greater":"Num2 is greater";
		System.out.println("Output:--> "+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		new GreaterOfTwoTernary().greaterOfTwoTernary(num1, num2);
	}

}
