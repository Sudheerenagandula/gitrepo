package packagecollection;

public class Loan {
	 
		private Book book;
		private String dueDate;
		private static  boolean isReturned;

			@SuppressWarnings("static-access")
			public Loan(Book book,String dueDate) {
				this.book=book;
				this.dueDate=dueDate;
				this.isReturned=false;
				
			}
			public Book getbook () {
				return book;
				
			}

			public String getdueDate() {
				return dueDate;
				
			}

			public boolean isReturned() {
				return isReturned;
				
			}
			
			public void setReturned ( boolean  returned ) {
				// TODO Auto-generated method stub
				  isReturned=returned;
			
			}

}
