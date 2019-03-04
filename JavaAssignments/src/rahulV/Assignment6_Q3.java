package rahulV;

import java.io.IOException;

public class Assignment6_Q3 {

	public void f() throws Exception {

		try {
			g();

		} catch (Exception e) {
			System.out.println("In catch block1");
			// e.printStackTrace();
			throw new Exception("parent exception");

		}
	}

	public void g() throws IOException {
		throw new IOException("Error");
	}

	public static void main(String[] args) {
		Assignment6_Q3 ex = new Assignment6_Q3();
		try {
			ex.f();
		} catch (Exception e) {
			System.out.println("In catch block2");
		}
	}

}