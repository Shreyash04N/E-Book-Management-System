package BookManagement;

import AllBooks.*;


public interface AdminManagement {
	
	
	public void addBooks(Books m);
	public void deleteBooks(String BookId);
	public void deleteUser(String userId);
	public void viewAllUsers();
	public void viewAllBooks();
	public void getUserDeatils(String userId);
	public void getBookDetails(String bookId);
	
	
	

}
