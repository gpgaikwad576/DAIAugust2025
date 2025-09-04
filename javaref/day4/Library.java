package day4;

import java.util.ArrayList;

public class Library {
	
	public static ArrayList<Book> getBookList()
	{
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(1100, "Java 8", 800));
		books.add(new Book(1101, "Complete ref Java", 900));
		books.add(new Book(1102, "Head First Java", 1800));
		return books;
	}

	public static void addBook(ArrayList<Book> books, Book book) 
			throws DuplicateBookException
	{
		for(Book b : books)
		{
			if(b.getIsbn() == book.getIsbn())
			{
				throw new DuplicateBookException("Book with the "
						+ "same ISBN exists in the list");
			}
		}
	}
	public static void main(String[] args) {
	
		ArrayList<Book> booklist = Library.getBookList();
		Book book = new Book(1101, "Complete ref Java", 900);
		try {
			Library.addBook(booklist, book);
		}
		catch (DuplicateBookException e) {
			System.out.println("Error while adding book : " + e.getMessage());
		}
	}

}
