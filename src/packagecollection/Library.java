package packagecollection;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;
	 
	public Library() {
		this.books =  new ArrayList<>();	
	}
	
	public void addBook (Book book) {
		books.add(book);	
	}
	
	public void removeBook (Book book) {
		books.remove(book);
	}
	
	public Book findBook(String title) {
		for (Book book:books) {
			if (book.getTitle().equals(title)) {
				return book;
				
			}
	}
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
