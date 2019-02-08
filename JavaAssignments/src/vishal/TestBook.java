package vishal;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Title");
		String title = sc.next();
		System.out.println("Enter Book Publisher");
		String bookPublisher = sc.next();
		System.out.println("Enter Author");
		String author = sc.next();

		Book book = new Book(title, bookPublisher, author);
		book.displayBookDetails();

	}

}
