package Entities;

import java.util.*;

import AllBooks.Books;
import BookManagement.UserManagement;
import StaticData.AvailableBooks;



public class User implements UserManagement {
	
	private String id;
	private String name,pwd,email;
	private ArrayList <Books> enrolledBooks;
	
	
	public User(String id, String name, String pwd, String email, ArrayList<Books> enrolledBooks) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.enrolledBooks = enrolledBooks;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public ArrayList<Books> getenrolledBooks() {
		return enrolledBooks;
	}
	
	public void setenrolledBooks(ArrayList<Books> enrolledBooks) {
		this.enrolledBooks = enrolledBooks;
	}
	
	@Override
	public void addBooks(String BookId) {
		enrolledBooks.add(AvailableBooks.availableBooks.get(BookId));
		
	}
	
	public boolean isEnrolledInBooks(String BookId) {
		for(Books x:enrolledBooks)
			if(x.getId().equals(BookId))
				return true;
		return false;
	}
	
	@Override
	public void deleteBook(String BookId) {
		Iterator<Books> it = enrolledBooks.iterator();
		while(it.hasNext())
		{
			if(it.next().getId().equals(BookId))
				it.remove();
		}
		
	}
	
	@Override
	public void viewAllAvailableBooks() {
		
		AvailableBooks.viewAllavailableBooks();
	}
	
	@Override
	public void viewEnrolledBooks() {
		if(enrolledBooks.size()==0)
		{
			System.out.println("Currently not enrolled in any Book");
			return;
		}
		
		
		for(Books x :enrolledBooks)
		{
			x.getDetails();
			System.out.println("--------------------------------------------------");
		}
		
	}
	
	
	@Override
	public void rateBook(String BookId, float rating) {
		Books curr_book=AvailableBooks.availableBooks.get(BookId);
		
		if(curr_book.getUserRatingsSet().contains(this.id))
		{
			System.out.println("You have already rated for this movie");
			return;
		}
		
		float curr_rating=curr_book.getRatings();//initial 0.0
		int curr_reviewers=curr_book.getReviewers();//initial 0
		curr_book.setRatings(((curr_rating*curr_reviewers)+rating)/(float)(curr_reviewers+1));
		curr_book.setReviewers(curr_reviewers+1);
		curr_book.getUserRatingsSet().add(id);
		
	}
	
	public void getUserDetails()
	{
		System.out.println("Id :- "+id);
		System.out.println("Name :- "+name);
		System.out.println("Email :- "+email);
		viewEnrolledBooks();
	}
	
	@Override
	public void viewBookDetails(String BookId) {
		AvailableBooks.getBooks(BookId).getDetails();
		
	}



}
