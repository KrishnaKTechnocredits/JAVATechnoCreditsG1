package amarja;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*Write a program to verify below behavior.
a. m2() called from m1().
 * Unchecked Exception occurred [lets say ArrayIndexOutOfBoundsException], methods throws an
exception and same method handle that exception using try catch. what you think exception
propagated to m1() ? m1() method has to handle that exception ?
 * Checked Exception occurred [lets say IOException], methods throws that checked exception and
same method handle that exception using try catch. what you think exception propagated to m1() ?
m1() method has to handle that exception ?

 */
public class Exception4 {

	public static void main(String[] args) {
		Exception4 ex4 = new Exception4();
		try {
			ex4.m2();
		} catch (Exception e) {
			System.out.println("Handling Propogated checked exception");
			e.printStackTrace();
		}
		System.out.println("Program ends");

	}

	void m1() throws IOException {
		FileReader file = null;
		// Unchecked Exception
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sr.nextInt();
		System.out.println("Enter values of array");
		int input[] = new int[size];
		for (int index = 0; index < size; index++)
			input[index] = sr.nextInt();
		try {
			for (int index = 0; index <= size; index++) // Created ArrayIndex
														// oUT OF BOUND
														// EXCEPTION
				System.out.println(input[index]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index value for array should be less than size of array");
			e.printStackTrace();
		} finally {
			sr.close();
		}
		// checked exception
		try {
			file = null;// Generating null pointer exception
		} catch (NullPointerException e) {
			System.out.println("Error intialized to null");
			e.printStackTrace();
		}
		try {
			file = new FileReader(".//TEXT.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception generated as text file is not found");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // File not found exception generated as text file is not found

		BufferedReader br = new BufferedReader(file);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}

	void m2() throws IOException {
		m1();
	}

}
