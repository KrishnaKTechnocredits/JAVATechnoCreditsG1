//------------------------------------------------------------------------------------------------------
//Assignment: WAP to input student marks by condition :
//Marks is greater than 0 and less than 50--FAIILED
//Marks is greater than 50 and less than 75--1st Class
//Marks greater than 75 –and less than 100 Distinction
//------------------------------------------------------------------------------------------------------

package shraddha;

import java.util.Scanner;

public class StudentClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Student Marks: ");
		int marks = sc.nextInt();
		String result ;

		result = (0 >= marks && marks <= 50) ? "Failed"
				: (50 < marks && marks <= 75) ? "1st Class"
						: (75 < marks && marks <= 100) ? "Distinction" : "Sorry Incorrect Marks/Score entered";
		System.out.println(result);
	}

}
