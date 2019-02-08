package amarja;
import java.util.Scanner;
/*Create a class Book having Title, Book Publisher, Author with parameterized constructor using this
 keyword. Write a method to display the details of the Book and Test the class by creating objects*/
public class Book {
	String title;String pub;String auth;
	Book(String title1,String pub1,String auth1)
	{
		Scanner src=new Scanner(System.in);
		System.out.println("Enter Title of Book:");
		title=src.next();
		System.out.println("Enter name of publisher :");
		pub=src.next();
		System.out.println("Enter author");
		auth=src.next();
		src.close();
	}
	void display()
	{
		System.out.println("Details of book are :");
		System.out.println("Title of Book: " + this.title);
		System.out.println("Publisher of Book: " + this.pub);
		System.out.println("Author of Book: " + this.auth);
	}
	

}
