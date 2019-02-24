package vishal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_Q3 {
	public static void main(String[] args) {
		Exception_Q3 q3=new Exception_Q3();
		
		try{
		q3.f();
		}
		catch(IOException e)
		{
			System.out.println("File not found,select valid file");
		}
		

	}

	public void f() throws IOException {
		System.out.println("This is f method");
		try {
			g();
		} catch (FileNotFoundException e) {
			throw new IOException();
		}

	}

	public void g() throws FileNotFoundException {
		System.out.println("This is g method");
		FileInputStream fs = new FileInputStream("D://");

	}

}
