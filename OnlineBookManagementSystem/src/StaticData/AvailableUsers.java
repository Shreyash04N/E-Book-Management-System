package StaticData;

import java.util.ArrayList;
import java.util.*;
import Entities.*;
import AllBooks.*;



public class AvailableUsers
{
	public static HashMap<String,User> users= new HashMap<String, User>();
	static int noOfUsers=1;
	public static HashMap<String,Admin> admins = new HashMap<String,Admin>();
	
	
	

	public static boolean exists(String userId)
	{
		return users.containsKey(userId);
	}
	
	static String generateId()
	{
		return "UR"+(noOfUsers++);
	}
	
	static
	{
		User u1 = new User(generateId(),"Shreyash","SJN","SJN@gmail.com",new ArrayList<Books>());
		users.put(u1.getId(),u1);
		u1.rateBook("RB1", 4);
		
		
	
		
		User u3 = new User(generateId(),"Tejas","Tejas9292","Tejas@gmail.com",new ArrayList<Books>());
		users.put(u3.getId(),u3);
		
		User u4 = new User(generateId(),"Sanket","Sanket","sanket@gmail.com",new ArrayList<Books>());
		users.put(u4.getId(),u4);
		
		User u5 = new User(generateId(),"Omkar","Omkar","omkar123@gmail.com",new ArrayList<Books>());
		users.put(u5.getId(),u5);
		
		Admin a1=new Admin("A01", "Shreyash", "Shreyash");
		admins.put(a1.getId(), a1);
	}
	
	
}