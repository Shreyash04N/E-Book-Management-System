package AllBooks;

public class Comics extends Books {

	public Comics(String B_id, String BookName, String AuthorName, int noOfPages, String description, float price) {
		super(B_id, BookName, AuthorName, noOfPages, description, price);
		setAllBooks("Comic Books");
	}
	
	public void getDetails()
	{
		super.getDetails();
	}

}
