package amarja;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*) Create a class with two methods, f( ) and g( ). In g( ), throw an checked exception. In f( ), call g( ),
catch its exception and, in the catch clause, throw parent of that checked exception. Handle that
exception in main method
  */

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception3 ex2 = new Exception3();
		try {
			ex2.f();
		} catch (FileNotFoundException e) {
			System.out.println("Main method :File not Found exception");
			e.printStackTrace();
		}
		System.out.println("Program ends");

	}

	void g() throws IOException// Checked exception
	{
		FileReader file = new FileReader(".//TEXT.txt");//File not found exception generated as text file is not found

		BufferedReader br = new BufferedReader(file);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();

	}

	void f() throws FileNotFoundException {
		try {
			g();
		} catch (IOException e) {
			System.out.println("Error: File notfound exception");
			e.printStackTrace();
		}

	}

}
