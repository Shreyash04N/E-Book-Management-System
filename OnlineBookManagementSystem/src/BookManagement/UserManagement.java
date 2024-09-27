package BookManagement;

public interface UserManagement {
	
	
	public void addBooks(String BookId);
	public boolean isEnrolledInBooks(String BookId);
	public void deleteBook(String BookId);
	public void viewAllAvailableBooks();
	public void viewEnrolledBooks();
	public void rateBook(String BookId,float rating);
	public void viewBookDetails(String BookId);

}
