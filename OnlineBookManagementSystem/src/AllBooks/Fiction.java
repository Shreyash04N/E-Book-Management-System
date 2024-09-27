package AllBooks;

public class Fiction extends Books
{
	
	private String storyLine;

	public Fiction(String B_id, String BookName, String AuthorName, int noOfPages, String description, float price, String storyline) 
	
	{
		super(B_id, BookName, AuthorName, noOfPages, description, price);
		
		this.storyLine=storyline;
		
	}
	
	public String getstoryLine() {
		return storyLine;
	}

	public void setstoryLine(String storyLine) {
		this.storyLine = storyLine;
	}
	
	
	public void getDetails()
	{
		System.out.println("Story Line :- "+storyLine);
		super.getDetails();
	}

}
