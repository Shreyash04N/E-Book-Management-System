package Entities;

import BookManagement.AdminManagement;
import AllBooks.*;
import StaticData.AvailableBooks;
import StaticData.AvailableUsers;

public class Admin implements AdminManagement 
{
	String id,adminName,pwd;
	
	public Admin(String id,String adminName, String pwd) {
		super();
		this.id=id;
		this.adminName = adminName;
		this.pwd = pwd;


	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public void addBooks(Books m) {
		AvailableBooks.availableBooks.put(m.getId(),m);
		
	}
	
	
	@Override
	public void deleteBooks(String BookId) {
		
		Books m = AvailableBooks.availableBooks.get(BookId);
		
		for(String x:AvailableUsers.users.keySet())
		{
			if(AvailableUsers.users.get(x).isEnrolledInBooks(BookId))
			{
				AvailableUsers.users.get(x).deleteBook(BookId);
			}
		}
		
		AvailableBooks.availableBooks.remove(BookId);
		
	}
	
	
	@Override
	public void deleteUser(String userId) 
	{
		AvailableUsers.users.remove(userId);
		
	}
	
	
	@Override
	public void viewAllUsers() {
		if(AvailableUsers.users.keySet().size()==0)
		{
			System.out.println("Currently no users are registered");
			return;
		}
		
		for(String x:AvailableUsers.users.keySet())
		{
			User temp = AvailableUsers.users.get(x);
			System.out.println(temp.getId()+" :- "+temp.getName());
			
		}
			
		
	}
	
	
	@Override
	public void viewAllBooks() 
	{
		AvailableBooks.viewAllavailableBooks();
		
	}
	
	
	@Override
	public void getUserDeatils(String userId)
	{
		AvailableUsers.users.get(userId).getUserDetails();
		
	}
	
	
	@Override
	public void getBookDetails(String bookId) 
	{
		AvailableBooks.getBooks(bookId).getDetails();
		
	}
	
	
	

	
}
	
	
	
