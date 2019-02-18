package saket;

public class Book {

	String Title;
	String bookpublisher;
	String author;

	Book(String BTitle, String bookpublishername, String authorname) {

		this.Title = BTitle;
		this.bookpublisher = bookpublishername;
		this.author = authorname;
		


	}

	void display() {
		System.out.println(Title);
		System.out.println(bookpublisher);
		System.out.println(author);

	}

	public static void main(String[] args) {

		Book b = new Book("shakesphere", "amazon", "the secreats");
		Book b1 = new Book("james", "amazonprime", "thesucess");

		
		b.display();
		b1.display();
	}

}
