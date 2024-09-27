package Driver;


import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import AllBooks.Books;
import AllBooks.Comics;
import AllBooks.Fiction;
import AllBooks.Poetry;
import AllBooks.Reference;
import AllBooks.Selfhelp;
import Entities.Admin;
import Entities.User;
import StaticData.AvailableBooks;
import StaticData.AvailableUsers;



public class Main {
	
	public static User login(String uname,String pwd)
	{
		if(!AvailableUsers.users.containsKey(uname))
			return null;
		else if (AvailableUsers.users.get(uname).getPwd().equals(pwd))
			return AvailableUsers.users.get(uname);
		else
			return null;
	}
	
	public static Admin Adlogin(String adname,String pwd)
	{
		if(!AvailableUsers.admins.containsKey(adname))
			return null;
		else if (AvailableUsers.admins.get(adname).getPwd().equals(pwd))
			return AvailableUsers.admins.get(adname);
		else
			return null;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean flag1=false;
		do 
		{
			System.out.println();
			System.out.println("===============================================");
			System.out.println("            Welcome to E-Book Management      *");
			System.out.println("                    System                    *");
			System.out.println("===============================================");
			
			
			System.out.println("Select appropriate option :- ");
			System.out.println();
			System.out.println("1. Sign In as a User");
			System.out.println("2. Sign In as a Admin");
			System.out.println("3. Set Up a New User Account");
			System.out.println("4. Exit application");
			
			
			
			try
			{
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1:
					System.out.println("Enter user id");
					String uname=sc.next();
					sc.nextLine();
					System.out.println("Enter password");
					String pwd=sc.next();
					User currUser = login(uname,pwd);
					if(currUser==null)
					{
						System.out.println("Invalid credentials");
						System.out.println("Please enter correct credentials...");
						break;
					}
					else
					{
						boolean flag2=false;
						String cId;
						do
						{
						System.out.println("Welcome "+currUser.getName()+" 👍👍👍");
						System.out.println("Please choose one of the following options: :- ");
						System.out.println("1. Discover Available Books");
						System.out.println("2. Add Book To My Library");
						System.out.println("3. See MY Books");
						System.out.println("4. Remove My Book");
						System.out.println("5. Rate a Book");
						System.out.println("6. Update user profile");
						System.out.println("7. View Book Details");
						System.out.println("8. Exit");
						
						try
						{
							int userChoice1=sc.nextInt();
							switch(userChoice1)
							{
								case 1:
									currUser.viewAllAvailableBooks();
									break;
									
								case 2:
									System.out.println("Enter Book id to add");
									sc.nextLine();
									cId=sc.next();
									if(!AvailableBooks.isAvailable(cId))
									{
										System.out.println("Book id doesnt exists");
									}
									else if(currUser.isEnrolledInBooks(cId))
									{
										System.out.println("You have been already enrolled in this Book");
									}
									else
									{
										currUser.addBooks(cId);
										System.out.println("Book added successfully...");
									}
									break;
									
								case 3:
									currUser.viewEnrolledBooks();
									break;
									
								case 4:
									System.out.println("Enter Book id to drop");
									sc.nextLine();
									cId=sc.next();
									if(!AvailableBooks.isAvailable(cId))
									{
										System.out.println("Invalid Book id");
									}
									else if(!currUser.isEnrolledInBooks(cId))
									{
										System.out.println("You are not enrolled in this Book");
									}
									else
									{
										currUser.deleteBook(cId);
										System.out.println("Book deleted successfully");
									}
									break;
									
								case 5:
									System.out.println("Enter Book id to rate");
									sc.nextLine();
									cId=sc.next();
									if(!AvailableBooks.isAvailable(cId))
									{
										System.out.println("Invalid Book id");
									}
									else if(!currUser.isEnrolledInBooks(cId))
									{
										System.out.println("You are not enrolled in this book");
									}
									else
									{
										
										
										System.out.println("Enter rating (0-5)");
										float rating;
										while(true)
										{
											rating=sc.nextFloat();
											if(rating <=5.0 && rating >=0.0)
												break;
											else
												System.out.println("Enter valid rating");
										}
										currUser.rateBook(cId, rating);
										System.out.println("Rating entered successfully...");
									}
									break;
									
								case 6:
									boolean Uflag=false;
									do
									{
										
										System.out.println("Select field to be modified");
										System.out.println("1. Name");
										System.out.println("2. Password");
										System.out.println("3. E-mail");
										System.out.println("4. Exit");
										try
										{
											int upChoice=sc.nextInt();
											sc.nextLine();
											String temp;
										
											
											switch(upChoice)
											{
												case 1:
													System.out.println("Enter new Name");
													temp=sc.next();
													currUser.setName(temp);
													System.out.println("Name updated sucessfully");
													break;
													
												case 2:
													System.out.println("Enter new Password");
													temp=sc.next();
													currUser.setPwd(temp);;
													System.out.println("Password updated sucessfully");
													break;
													
												case 3:
													System.out.println("Enter new Email");
													temp=sc.next();
													currUser.setEmail(temp);;
													System.out.println("Name updated sucessfully");
													break;
													
												case 4:
													Uflag=true;
													break;
													
												default:
													System.out.println("Enter valid option");
													
												
													
											}
										}
										catch(InputMismatchException e)
										{
											System.out.println("Enter only numeric value within given range");
											sc.nextLine();
										}
										catch(Exception e)
										{
											
											System.out.println("Something went wrong");
											e.printStackTrace();
										}
										
									}while(!Uflag);
									break;
									
								case 7:
									System.out.println("Enter Book id to view Book");
									sc.nextLine();
									cId=sc.next();
									if(!AvailableBooks.isAvailable(cId))
									{
										System.out.println("Invalid Book id");
									}
									else
									{
										AvailableBooks.getBooks(cId).getDetails();
									}
									break;
									
								case 8:
									flag2=true;
									break;
									
								default:
									System.out.println("Enter valid option");
									break;
									
							}
							
						}
						catch(InputMismatchException e)
						{
							System.out.println("Enter numeric values within provided range");
							sc.nextLine();
						}
						catch(Exception e)
						{
							System.out.println("Unexpected error occured");
							e.printStackTrace();
						}
						}while(!flag2);
						
						
					}
				
				break;
				case 2:
					System.out.println("Enter admin name");
					String adame=sc.next();
					sc.nextLine();
					System.out.println("Enter password");
					String adpwd=sc.next();
					
					Admin currAdmin=Adlogin(adame, adpwd);
					if(currAdmin==null)
					{
						System.out.println("Invalid credentials");
						break;
					}
					else
					{
						
						boolean flag3=true;
						do
						{
							System.out.println("Welcome Admin "+currAdmin.getAdminName());
							System.out.println("Select an option");
							System.out.println("1. Add New Books");
							System.out.println("2. Delete Books");
							System.out.println("3. View all users");
							System.out.println("4. View all Books");
							System.out.println("5. Deactivate (delete) user");
							System.out.println("6. View User details");
							System.out.println("7. View Books details");
							System.out.println("8. Exit");
							
							
							
							try
							{
								int adChoice=sc.nextInt();
								sc.nextLine();
								switch(adChoice)
								{
									case 1:
										try
										{
											System.out.println("Enter Book Id");
											String tempId=sc.next();
											if(AvailableBooks.getBooks(tempId)!=null)
											{
												System.out.println("Book with given id alreaady exists");
												break;
											}
											sc.nextLine();
											System.out.println("Enter Book Name");
											String tempBookName=sc.next();
											
											sc.nextLine();
											System.out.println("Enter Author Name");
											String tempAuthorName=sc.nextLine();
											System.out.println("Enter Number of Pages");
											int tempNumOFPages=sc.nextInt();
											sc.nextLine();
											System.out.println("Enter description of Book");
											String tempDescription=sc.nextLine();
											System.out.println("Enter price of Book");
											float tempPrice=sc.nextFloat();
											
											System.out.println("Select the type of Book");
											System.out.println("1. Self-Help Books");
											System.out.println("2. Poetry Books");
											System.out.println("3. Comic Books");
											System.out.println("4. Fiction Books");
											System.out.println("5. Reference Books");
											
											try
											{
												int bookTypeChoice=sc.nextInt();
												sc.nextLine();
												switch(bookTypeChoice)
												{
													case 1:
														String storyLine;System.out.println("Enter Language : ");
														storyLine=sc.nextLine();
														
														currAdmin.addBooks(new Selfhelp(tempId, tempBookName, tempAuthorName, tempNumOFPages, tempDescription, tempPrice, storyLine));
														System.out.println("SelfHelp Book added successfully");
														break;
														
													case 2:
														
												
														
														
														currAdmin.addBooks(new Poetry(tempId, tempBookName, tempAuthorName, tempNumOFPages, tempDescription,
		tempPrice));
														System.out.println("Poetry Book added successfully");
														break;
														
														
													case 3:
														
														currAdmin.addBooks(new Comics(tempId, tempBookName, tempAuthorName, tempNumOFPages, tempDescription,
																tempPrice));
														System.out.println("Comic Books added successfully");
														break;
														
													case 4:
														System.out.println("Enter Language of Book");
														String storyLine1=sc.nextLine();
														currAdmin.addBooks(new Fiction(tempId, tempBookName, tempAuthorName, tempNumOFPages, tempDescription,
																tempPrice,storyLine1));
														System.out.println("Fiction book added successfully");
														break;
														
													case 5:
														currAdmin.addBooks(new Reference(tempId, tempBookName, tempAuthorName, tempNumOFPages, tempDescription,tempPrice));
														System.out.println("Reference Book added successfully");
														break;
														
													default:
														System.out.println("Enter valid option");
														break;
												}

												
											}
											catch(InputMismatchException e)
											{
												System.out.println("Enter only integer value within expected range");
												sc.nextLine();
											}
											catch(Exception e)
											{
												System.out.println("Unknown exception occured");
												e.printStackTrace();
											}
											
											
											
										}
										catch(InputMismatchException e)
										{
											System.out.println("Enter only integer value within expected range");
											sc.nextLine();
										}
										catch(Exception e)
										{
											System.out.println("Unknown exception occured");
											e.printStackTrace();
										}
										
										break;
										
										
									case 2:
										System.out.println("Enter Book id to delete");
										
										String cId=sc.next();
										if(!AvailableBooks.isAvailable(cId))
											System.out.println("Book with id "+cId+" doesn't exists");
										else
										{
											currAdmin.deleteBooks(cId);
											System.out.println("Book deleted successfully");
										}
										break;
										
									case 3:
										
										currAdmin.viewAllUsers();
									
										break;
										
									case 4:
										currAdmin.viewAllBooks();
										break;
									
									case 5:
										System.out.println("Enter user-id to delete");
										
										String tempId=sc.next();
										if(!AvailableUsers.exists(tempId))
										{
											System.out.println("User with id "+tempId+" doesn't exists");
										}
										else
										{
											currAdmin.deleteUser(tempId);
											System.out.println("User deleted successfully");
										}
										break;
										
									
										
										
									case 6:
										System.out.println("Enter user-id to get details of");
										String tempuId=sc.next();
										if(!AvailableUsers.exists(tempuId))
										{
											System.out.println("User with id "+tempuId+" doesn't exists");
										}
										else
										{
											currAdmin.getUserDeatils(tempuId);
										}
										break;
										
									case 7:
										System.out.println("Enter Book id to get details of");
										String tempcId=sc.next();
										if(!AvailableBooks.isAvailable(tempcId))
										{
											System.out.println("Book with id "+tempcId+" doesn't exists");
										}
										else
										{
											currAdmin.getBookDetails(tempcId);
										}
										break;
										
									case 8:
										flag3=false;
										break;
						
										
									default:
										System.out.println("Invalid choice");
										break;		
								}
								
							}
							
							catch(InputMismatchException e)
							{
								System.out.println("Enter only integer value within expected range");
								sc.nextLine();
							}
							catch(Exception e)
							{
								System.out.println("Unknown exception occured");
								e.printStackTrace();
							}
							
						}while(flag3);
					}
					break;
					
				case 3:
					System.out.println("Welcome to our platform");
					System.out.println("Enter your name");
					String nName=sc.next();
					sc.nextLine();
					System.out.println("Enter email");
					String nEmail=sc.next();
					System.out.println("Enter a userId");
					String id;
					while(true)
					{
						sc.nextLine();
						id=sc.next();
						if(AvailableUsers.exists(id))
						{
							System.out.println("Username already exits plz try another uname");
						}
						else
							break;
					}
					sc.nextLine();
					System.out.println("Enter password");
					String temp_pwd=sc.next();
					AvailableUsers.users.put(id, new User(id, nName, temp_pwd, nEmail, new ArrayList<Books>()));
					System.out.println("Account created successfully");
					break;
					
					
				case 4:
					System.out.println("Program terminated sucessfully");
					flag1=true;
					break;
				}
				
			}
			catch(InputMismatchException e)
			{
				System.out.println("Enter numeric values within provided range");
				sc.nextLine();
			}
			
			catch(Exception e)
			{
				System.out.println("Unexpected error occured");
				e.printStackTrace();
			}
		}while(!flag1);
		
		
		
		
	}														
													
						
					
						
				

}
