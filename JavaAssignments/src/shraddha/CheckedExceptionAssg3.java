/*-------------------------------------------------------------------------------------------------------------
Assignment: Create a class with two methods, f( ) and g( ). In g( ), throw an checked exception.
 In f( ), call g( ), catch its exception and, in the catch clause, throw parent of that checked exception.
Handle that exception in main method.
--------------------------------------------------------------------------------------------------------------- */

package shraddha;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionAssg3 {

	void f() throws IOException {
		try {
			g();
		} catch (FileNotFoundException e) {
			throw new IOException();
		}
	}

	void g() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {

		CheckedExceptionAssg3 c = new CheckedExceptionAssg3();
		try {
			c.f();
		} catch (IOException e) {
			System.out.println("Exception caught");
		}
	}

}
