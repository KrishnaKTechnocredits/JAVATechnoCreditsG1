package vishal;

import java.util.Scanner;

public class TestSquare {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side value");
		int side=sc.nextInt();
		
		Square square=new Square(side);
		square.areaSquare();

	}

}
