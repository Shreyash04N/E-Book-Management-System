package StaticData;

import java.util.ArrayList;
import java.util.HashMap;

import AllBooks.*;

public class AvailableBooks 
{
	public static HashMap <String,Books> availableBooks = new HashMap<String,Books>();
	public static ArrayList <Books> Fiction;
	public static ArrayList <Books> Selfhelp;
	public static ArrayList <Books> Reference;
	public static ArrayList <Books> Poetry;
	public static ArrayList <Books> Comics;
	
	
	
	public static Books getBooks(String BookId)
	{
		return availableBooks.get(BookId);
	}
	
	public static boolean isAvailable(String BookId)
	{
		return availableBooks.containsKey(BookId);
	}
	

	
	
	//SIB-1  ==> Book initialization for Fictional Books
	static
	{
	    String temp_description = "A critically acclaimed novel exploring themes of family, caste, and the lingering effects of colonialism in India.";
	    		
	    //Book 1
	    Fiction F1 = new Fiction("FB1", "The God of Small Things", "Arundhati Roy", 432, temp_description, 2000, "English");
	    
	    availableBooks.put(F1.getId(), F1);
	    
	    
	 // Book 2: The Palace of Illusions
	    
	    String temp_description2 = "A retelling of the Mahabharata epic from the perspective of Draupadi, one of the five wives of the Pandavas.";
	    
	    Fiction F2 = new Fiction("FB2", "The Palace of Illusions", "Chitra Banerjee Divakaruni", 368, temp_description2, 1500, "English");

	    availableBooks.put(F2.getId(), F2);

	    // Book 3: Midnight's Children
	    String temp_description3 = "A magical realist novel that traces the lives of a group of children born at midnight on August 15, 1947, the day India gained independence.";
	    Fiction F3 = new Fiction("FB3", "Midnight's Children", "Salman Rushdie", 552, temp_description3, 2500, "English");
	    availableBooks.put(F3.getId(), F3);

	    // Book 4: The Namesake
	    String temp_description4 = "A coming-of-age novel about an Indian-American family struggling to balance their cultural heritage with their assimilation into American society.";
	    Fiction F4 = new Fiction("FB4", "The Namesake", "Jhumpa Lahiri", 240, temp_description4, 1500, "English");
	    availableBooks.put(F4.getId(), F4);

	    // Book 5: A Suitable Boy
	    String temp_description5 = "A sprawling novel that follows the lives of four families in post-independence India as they search for suitable marriage partners for their children.";
	    Fiction F5 = new Fiction("FB5", "A Suitable Boy", "Vikram Seth", 1379, temp_description5, 3000, "English");
	    availableBooks.put(F5.getId(), F5);
	}

	
	
	//SIB - 2 => Book initialization for Selfhelp Books
	
	static
	{
		// Creating Self-help Books

		// Book 1: Atomic Habits
		String temp_description1 = "A guide to building good habits and breaking bad ones, focusing on small, incremental changes.";
		Selfhelp SHB1 = new Selfhelp("SHB1", "Atomic Habits", "James Clear", 256, temp_description1, 2000, "Self-help");
		availableBooks.put(SHB1.getId(), SHB1);

		// Book 2: The 7 Habits of Highly Effective People
		String temp_description2 = "A timeless classic that outlines seven principles for personal and professional success.";
		Selfhelp SHB2 = new Selfhelp("SHB2", "The 7 Habits of Highly Effective People", "Stephen Covey", 320, temp_description2, 2000, "Self-help");
		availableBooks.put(SHB2.getId(), SHB2);

		// Book 3: Mindset: The New Psychology of Success
		String temp_description3 = "A book that explores the power of fixed and growth mindsets and how they impact our success.";
		Selfhelp SHB3 = new Selfhelp("SHB3", "Mindset: The New Psychology of Success", "Carol Dweck", 272, temp_description3, 2000, "Self-help");
		availableBooks.put(SHB3.getId(), SHB3);

		// Book 4: The Power of Positive Thinking
		String temp_description4 = "A classic self-help book that emphasizes the importance of positive thinking and its impact on personal and professional success.";
		Selfhelp SHB4 = new Selfhelp("SHB4", "The Power of Positive Thinking", "Norman Vincent Peale", 256, temp_description4, 1500, "Self-help");
		availableBooks.put(SHB4.getId(), SHB4);

		// Book 5: The Alchemist
		String temp_description5 = "A philosophical novel that follows a young shepherd boy on a journey to discover his personal legend.";
		Selfhelp SHB5 = new Selfhelp("SHB5", "The Alchemist", "Paulo Coelho", 128, temp_description5, 1500, "Philosophy");
		availableBooks.put(SHB5.getId(), SHB5);

	}

	
	
	
	//SIB - 3 => Book initialization for Comic Books
	
	static
	{
	   

	 // Book 1: Watchmen
	 String description1 = "A critically acclaimed graphic novel exploring themes of morality, philosophy, and the nature of superheroes.";
	 Comics CB1 = new Comics("CB1", "Watchmen", "Alan Moore", 400, description1, 2500.0f);
	 availableBooks.put(CB1.getId(), CB1);

	 // Book 2: Maus
	 String description2 = "A graphic novel that depicts the author's father's experiences as a Jewish survivor of the Holocaust.";
	 Comics CB2 = new Comics("CB2", "Maus", "Art Spiegelman", 156, description2, 2500.0f);
	 availableBooks.put(CB2.getId(), CB2);

	 // Book 3: V for Vendetta
	 String description3 = "A dystopian graphic novel set in a future England ruled by a totalitarian government.";
	 Comics CB3 = new Comics("CB3", "V for Vendetta", "Alan Moore", 320, description3, 2500.0f);
	 availableBooks.put(CB3.getId(), CB3);

	 // Book 4: The Dark Knight Returns
	 String description4 = "A graphic novel that reimagines Batman as an aging superhero in a future Gotham City.";
	 Comics CB4 = new Comics("CB4", "The Dark Knight Returns", "Frank Miller", 240, description4, 2500.0f);
	 availableBooks.put(CB4.getId(), CB4);

	 // Book 5: Persepolis
	 String description5 = "A graphic memoir that depicts the author's childhood and adolescence in Iran during the Islamic Revolution.";
	 Comics CB5 = new Comics("CB5", "Persepolis", "Marjane Satrapi", 140, description5, 1500.0f);
	 availableBooks.put(CB5.getId(), CB5);
	 

	}

	//SIB-4 Reference Books
	static
	{
	    
	    
	    
	 // Creating Reference Books

	 // Book 1: Encyclopedia Britannica
	 String description1 = "A comprehensive encyclopedia covering a wide range of topics, from history and science to art and literature.";
	 Reference RB1 = new Reference("RB1", "Encyclopedia Britannica", "Encyclopædia Britannica, Inc.", 0, description1, 5000.0f);
	 availableBooks.put(RB1.getId(), RB1);

	 // Book 2: Oxford English Dictionary
	 String description2 = "A historical dictionary of the English language, tracing the history and evolution of words.";
	 Reference RB2 = new Reference("RB2", "Oxford English Dictionary", "Oxford University Press", 20000, description2, 10000.0f);
	 availableBooks.put(RB2.getId(), RB2);

	 // Book 3: Merriam-Webster's Collegiate Dictionary
	 String description3 = "A popular and widely used general-purpose dictionary of the English language.";
	 Reference RB3 = new Reference("RB3", "Merriam-Webster's Collegiate Dictionary", "Merriam-Webster, Inc.", 1450, description3, 200.0f);
	 availableBooks.put(RB3.getId(), RB3);

	 // Book 4: The Cambridge History of English Literature
	 String description4 = "A comprehensive history of English literature, covering authors, works, and literary movements from the Anglo-Saxon period to the present day.";
	 Reference RB4 = new Reference("RB4", "The Cambridge History of English Literature", "Cambridge University Press", 0, description4, 7000.0f);
	 availableBooks.put(RB4.getId(), RB4);

	 // Book 5: The New York Times Manual of Style and Usage
	 String description5 = "A style guide used by journalists and writers, providing guidelines on grammar, punctuation, and usage.";
	 Reference RB5 = new Reference("RB5", "The New York Times Manual of Style and Usage", "The New York Times Company", 700, description5, 300.0f);
	 availableBooks.put(RB5.getId(), RB5);

	}

	//SIB-5 Poetry Books
	static
	{
	
	    //Book 1

	    String description1 = "A collection of poems exploring themes of life, love, and loss.";
	    Poetry PB1 = new Poetry("PB1", "Madhushala", "Harivansh Rai Bachchan", 128, description1, 150.0f);
	    availableBooks.put(PB1.getId(), PB1);

	    String description2 = "A Sanskrit poem celebrating the love between Krishna and Radha.";
	    Poetry PB2 = new Poetry("PB2", "Geet Govind", "Jayadeva", 128, description2, 250.0f);
	    availableBooks.put(PB2.getId(), PB2);

	    String description3 = "A collection of Urdu poems exploring themes of love, loss, and social injustice.";
	    Poetry PB3 = new Poetry("PB3", "Urfi", "Faiz Ahmed Faiz", 128, description3, 200.0f);
	    availableBooks.put(PB3.getId(), PB3);

	    String description4 = "A collection of poems exploring themes of nostalgia, love, and loss.";
	    Poetry PB4 = new Poetry("PB4", "Yaadon Ki Baraat", "Gulzar", 128, description4, 200.0f);
	    availableBooks.put(PB4.getId(), PB4);

	    String description5 = "A collection of Bengali poems exploring themes of love, loss, and social injustice.";
	    Poetry PB5 = new Poetry("PB5", "Triveni", "Dinabandhu Mitra", 128, description5, 250.0f);
	    availableBooks.put(PB5.getId(), PB5);

	}

	
	public static void viewAllavailableBooks()
	{
		Fiction = new ArrayList<Books>();
		Selfhelp = new ArrayList<Books>();
		Comics = new ArrayList<Books>();
		Reference = new ArrayList<Books>();
		Poetry = new ArrayList<Books>();
		
		for(String i:AvailableBooks.availableBooks.keySet())
		{
			String BooksType = AvailableBooks.availableBooks.get(i).getClass().getSimpleName();
			switch(BooksType)
			{
				case "Poetry":
					Poetry.add(AvailableBooks.availableBooks.get(i));
					break;
				case "Fiction":
					Fiction.add(AvailableBooks.availableBooks.get(i));
					break;
				case "Selfhelp":
					Selfhelp.add(AvailableBooks.availableBooks.get(i));
					break;
				case "Reference":
					Reference.add(AvailableBooks.availableBooks.get(i));
					break;
					
				case "Comics":
					Comics.add(AvailableBooks.availableBooks.get(i));
					break;	
			}
			
		}
			
		System.out.println("*****************************************************************************************");
		System.out.println("Fiction Books");// Polymorphism example
		for(Books x:Fiction)
			System.out.println("Books id :- "+x.getId()+" Books name :- "+x.getBookName());
		
		System.out.println("*****************************************************************************************");
		System.out.println("Selfhelp books");
		for(Books x:Selfhelp)
			System.out.println("Books id :- "+x.getId()+" Books name :- "+x.getBookName());
		
		System.out.println("*****************************************************************************************");
		System.out.println("Comics Books");
		for(Books x:Comics)
			System.out.println("Books id :- "+x.getId()+" Books name :- "+x.getBookName());
		
		System.out.println("*****************************************************************************************");
		System.out.println("Poetry books");
		for(Books x:Poetry)
			System.out.println("Books id :- "+x.getId()+" Books name :- "+x.getBookName());
		
		System.out.println("*****************************************************************************************");
		System.out.println("Reference books");
		for(Books x:Reference)
			System.out.println("Books id :- "+x.getId()+" Books name :- "+x.getBookName());
	
		
		
	}

	
	
	
	
}

