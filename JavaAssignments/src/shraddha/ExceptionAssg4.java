/*-----------------------------------------------------------------------------
 Assignment: Write a program to verify below behavior.
a. m2() called from m1().

*Unchecked Exception occurred [lets say ArrayIndexOutOfBoundsException], methods throws an
exception and same method handle that exception using try catch. what you think exception
propagated to m1() ? m1() method has to handle that exception ?
----> Ans: not a compulsion to handle it in m1. it internally gets propagated.

*Checked Exception occurred [lets say IOException], methods throws that checked exception and
same method handle that exception using try catch. what you think exception propagated to m1() ?
m1() method has to handle that exception ? -----> yes m1 has to handle the exception. and cannot handle it in m2.
 * 
 ------------------------------------------------------------------------------*/

package shraddha;

import java.io.IOException;

public class ExceptionAssg4 {

	void m1() {
		try {
			m2();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void m2() throws IOException,ArrayIndexOutOfBoundsException {
		try {

		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{

		}
	}
	
	public static void main(String[] args) {
		ExceptionAssg4 e = new ExceptionAssg4();
		e.m1();
	}

}
