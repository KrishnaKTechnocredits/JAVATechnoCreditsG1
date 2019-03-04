package vishal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionQuestion4b {

	public static void main(String[] args) {
		ExceptionQuestion4b q4b = new ExceptionQuestion4b();
		q4b.m1();
	}

	public void m1() {
		try {
			m2();
		} catch (FileNotFoundException e) {
			System.out.println("Handle exception");
		}
	}

	public void m2() throws FileNotFoundException {
		try {
			FileInputStream fs = new FileInputStream("D://");
		} catch (FileNotFoundException e) {
			System.out.println("Select valid file");
		}

	}

}