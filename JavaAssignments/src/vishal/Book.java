package vishal;

public class Book {
	String Title;
	String BookPublisher;
	String Author;

	Book(String Title, String BookPublisher, String Author) {
		this.Title = Title;
		this.BookPublisher = BookPublisher;
		this.Author = Author;
	}

	public void displayBookDetails() {
		System.out.println("Book Title is " + Title);
		System.out.println("Book publisher is " + BookPublisher);
		System.out.println("Book Author is " + Author);
	}

}
