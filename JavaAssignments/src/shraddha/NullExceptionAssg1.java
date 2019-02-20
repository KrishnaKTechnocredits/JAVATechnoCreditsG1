/*-----------------------------------------------------------------------------------------------------------------
Assignment: Define an object reference and initialize it to null. Try to call a method through this reference.
Now wrap the code in a try-catch clause to catch the exception. 
 *------------------------------------------------------------------------------------------------------------------*/

package shraddha;

public class NullExceptionAssg1 {

	void method_1() {
		System.out.println("Method_1");
	}

	public static void main(String[] args) {
		NullExceptionAssg1 n = null;
		System.out.println(n); // prints null as no memory assigned.
		try {
			n.method_1();
		} catch (NullPointerException e) {
			System.out.println("Heyyyy method 1 cant be called as object does not have memory assigned..!!");
		}
	}
}
