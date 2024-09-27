package AllBooks;

public class Reference extends Books

{

	public Reference(String B_id, String BookName, String AuthorName, int noOfPages, String description, float price) 
	{
		super(B_id, BookName, AuthorName, noOfPages, description, price);
		setAllBooks("Reference Books");
		
	}
	
	public void getDetails()
	{
		super.getDetails();
	}

}
