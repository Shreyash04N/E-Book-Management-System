package AllBooks;

public class Selfhelp extends Books
{
	
	
	
	
	public Selfhelp(String B_id, String BookName, String AuthorName, int noOfPages, String description, float price,String storyLine)
	{
		super(B_id, BookName, AuthorName, noOfPages, description, price);

		setAllBooks("Selfhelp Books");
		
	}
	
	
	
	
	public void getDetails()
	{
		super.getDetails();
		
		
	}

	
	

}
