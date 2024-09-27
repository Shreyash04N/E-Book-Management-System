package AllBooks;

import java.util.HashSet;
import java.util.Set;

public class Books {
	
	
	private String B_id;
	private String BookName,AuthorName;
	private int noOfPages;
	private String description;
	private float price;
	private float ratings=0.0f;
	private int reviewers=0;
	private String AllBooks;
	private Set<String> ratingUsers = new HashSet<String>();
	
	
	public void userRatedBooks(String B_id)
	{
		ratingUsers.add(B_id);
	}
	
	
	public Set<String> getUserRatingsSet()
	{
		return ratingUsers;
	}
	
	
	public Books(String B_id, String BookName, String AuthorName, int noOfPages, String description, float price) {
        this.B_id = B_id;
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.noOfPages = noOfPages;
        this.description = description;
        this.price = price;
    }
	
	
	public String getAllBooks() {
		return AllBooks;
	}
	
	
	public void setAllBooks(String AllBooks) {
		this.AllBooks = AllBooks;
		
	}
	
	
	 public String getId() {
	        return B_id;
	    }
	 

	 public void setId(String B_id) {
	        this.B_id = B_id;
	    }
	 
	 
	 public int getReviewers() {
			return reviewers;
		}

	 public void setReviewers(int reviewers) {
			this.reviewers = reviewers;
		}
	 
	 public String getBookName() {
	        return BookName;
	    }

	 public void setBookName(String BookName) {
	        this.BookName = BookName;
	    }
	 
	 public String getAuthorName() {
	        return AuthorName;
	    }

	 public void setAuthorName(String AuthorName) {
	        this.AuthorName = AuthorName;
	    }
	 
	 public int getNoOfPages() {
	        return noOfPages;
	    }

	 public void setNoOfPages(int noOfPages) {
	        this.noOfPages = noOfPages;
	    }
	 
	 public String getDescription() {
	        return description;
	    }

	 public void setDescription(String description) {
	        this.description = description;
	    }
	 
	 public float getPrice() {
			return price;
		}
	 public void setPrice(float price) {
			this.price = price;
		}
	public float getRatings() {
			return ratings;
		}
	public void setRatings(float ratings) {
			this.ratings = ratings;
		}
	
	
	
	public void getDetails() {
	    System.out.println("Book ID: " + B_id);
	    System.out.println("Book Name: " + BookName);
	    System.out.println("Author Name: " + AuthorName);
	    System.out.println("Number of Pages: " + noOfPages);
	    System.out.println("Description: " + description);
	    System.out.println("Price: $" + price);
	    System.out.println("Ratings :- "+ratings+" (reviewed by "+reviewers+")");
	}


}
