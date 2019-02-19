package saket;

import java.util.Scanner;

public class Studentmarks {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student marks");

		int marks = sc.nextInt();

		studentdivision(marks);

	}

	static void studentdivision(int Marks) {

		if (Marks > 0 && Marks <= 50) {
			System.out.println("Sorry you have failed");
		}
		if (Marks > 50 && Marks < 75) 
		{
			System.out.println("Dear student you have got first class");
		}
		if (Marks > 75 && Marks < 100) {
			System.out.println("Congrats Dear student you have got Distinction ");
		}

	}

}
