//Find Greater number using ternary Operator'
package mayur;

import java.util.Scanner;

public class TernaryOp {
	int greaterUsingTernary(int firstNumber, int secondNumber) 
	{
		return firstNumber > secondNumber ? firstNumber : secondNumber; //return greater number
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int secondNumber = sc.nextInt();
		TernaryOp ternaryOp = new TernaryOp();
		System.out.println("Greater Number is:" + ternaryOp.greaterUsingTernary(firstNumber, secondNumber));
		sc.close();
	}
}
