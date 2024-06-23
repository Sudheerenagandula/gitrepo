package packagecollection;

public class Book {
private String title;
private String author;
private static  boolean isAvailable;

	@SuppressWarnings("static-access")
	public Book (String title,String author) {
		this.title=title;
		this.author=author;
		this.isAvailable=true;
		
	}
	public String getTitle() {
		return title;
		
	}

	public String getAuthor() {
		return author;
		
	}

	public boolean isAvailable() {
		return isAvailable;
		
	}
	
	public void setAvailable ( boolean available ) {
		// TODO Auto-generated method stub
		  isAvailable = available;
	
	}
	 
	}


