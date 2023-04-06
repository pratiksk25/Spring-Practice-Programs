package com.ZTest.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Please read all the comments carefully.
 * 
 * Problem Statement
 * 
 * 
 * 1. Add expected release dates as mentioned in init method.
 * 2. Merge books if title is same then add the book to the set with latest release date, else add the new book to the set
 * 3. Write the logic to Sort the books by release date
 * 
 * PS 
 *  - Make your changes only in BookService class below line 126
 *  - Do not use comparator for set operation, use sorting algorithms instead.
 * 
 * After Coding is complete
 * 
 * 1. Scroll below and test with Execute method, make sure your code comppiles and displays the desired output.
 * 2. Next to Execute Button click on three dots ... button to show side menu.
 * 3. Once the side menu opens click on `Instant Share - Embed (No Login/Save required)` and then click on `Create Share`. 
 * 4. Do not change the code after share url is generated else repeat this process again.
 * 5. Copy the generated embed share url and open in new broswer and make sure your changes are reflected and work properly.
 * 6. Email the copied share url to careers@cursivetech.com
 * 
 **/

public class LibraryAppApplication {

    public static void main(String[] args) {
        System.out.println("Test application Started");
        BookService bookService = new BookService();

        try {
            // Init books set
            bookService.initBooks();
            
            // Create new books to test your merge logic
            Book b1 = new Book();
            b1.setTitle("Learn React");
            b1.setIsbn(124);
            b1.setReleaseDate(new Date());

            Book b2 = new Book();
            b2.setTitle("Learn React");
            b1.setIsbn(125);
            b2.setReleaseDate(new Date(System.currentTimeMillis() - 1000));
            
            // Call merge method to test the outcome
            Boolean isBookMerged = bookService.mergeBooks(b1, b2); // Merge book b1 and b2
            
            System.out.println("Book Merged -- " + isBookMerged); // Expected true

            Book b3 = new Book();
            b3.setTitle("Learn Hibernate");
            b1.setIsbn(126);
            b3.setReleaseDate(new Date(System.currentTimeMillis() - 1000));

             // Call merge method again and test the outcome for different test data
            isBookMerged = bookService.mergeBooks(b2, b3); // Merge book b2 and b3
            
            System.out.println("Book Merged -- " + isBookMerged); // Expected false
            
            // Call sort book method to get sorted list of books in set
            bookService.sortBooks();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// DO NOT CHANGE BOOK CLASS
class Book {

    private int isbn;

    private String title;

    private Date releaseDate;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", releaseDate=" + releaseDate + "]";
	}
    
    

}

class BookService{
    Set<Book> books = new HashSet<Book>();

    public void initBooks() throws ParseException {
        Book book;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");

        // Book 1
        book = new Book();
        book.setIsbn(111);
        book.setTitle("Learn Java");
        // Set Book date to 5th Nov 2020, UNCOMMENT LINE BELOW AND ADD YOUR LOGIC TO SET THE DATE 
        Date dateBook1 = dateFormat.parse("5 NOV 2020");
        book.setReleaseDate(dateBook1);
        this.books.add(book);

        // Book 2
        book = new Book();
        book.setIsbn(112);
        book.setTitle("Learn Angular");
        // Set Book date to 2rd oct 2012, UNCOMMENT LINE BELOW AND ADD YOUR LOGIC TO SET THE DATE
        Date dateBook2 = dateFormat.parse("2 OCT 2012");
        book.setReleaseDate(dateBook2);
        this.books.add(book);

        // Book 3
        book = new Book();
        book.setIsbn(113);
        book.setTitle("Learn Spring");
        // Set Book date to 21st Nov 2021, UNCOMMENT LINE BELOW AND ADD YOUR LOGIC TO SET THE DATE
        Date dateBook3 = dateFormat.parse("21 NOV 2021");
        book.setReleaseDate(dateBook3);
        this.books.add(book);

        System.out.println(this.books.size() + " Books in Library\n\n");

    }

    public Boolean mergeBooks(Book book1, Book book2) {
        Boolean isBookMerged = false;

        // Check if book 1 and book 2 is same if yes then merge the book and return true also add the Merged book to book set
        // Add Merge logic below
        
        //UNCOMMENT LINE BELOW AND ADD YOUR LOGIC FOR MERGE
        
        Book mergedBook = null ;
          if(book1.getTitle().equals(book2.getTitle())){
        	  
        	  if(book1.getReleaseDate().compareTo(book2.getReleaseDate())>0) {
        		  mergedBook = book1;
        		  books.remove(book2);
        				  
        	  }else if(book1.getReleaseDate().compareTo(book2.getReleaseDate())<0){
        		  mergedBook = book2;
        		  books.remove(book1);
        	  }
        	  isBookMerged =  true;
          }
         
         
         
         //Add to books set logic below. If the books are merged add one with latest release date to the set if not merged add both the books to the set
         
         //UNCOMMENT LINE BELOW AND ADD YOUR LOGIC FOR ADDED MERGED BOOK TO BOOK SET
         
          if(isBookMerged) {
        	  books.add(mergedBook);
          }
          else {
        	  boolean flag1 = false;
        	  boolean flag2 = false;
        	  for(Book book : books) {
        		  if( book.getTitle().equals(book1.getTitle())) {
        			  flag1 = true;
        		  }
        		  if(book.getTitle().equals(book2.getTitle())) {
        			  flag2 = true;
        		  }
        	  }
        	  if(!flag1) {
        		  books.add(book1);
        	  }
        	  if(!flag2) {
        		  books.add(book2);
        	  }
          }
         

        // DO NOT CHANGE CODE BELOW
        return isBookMerged;
    }

    public void sortBooks() {
        System.out.println("\n\n\nInside Sort books");
        Book book;
        Iterator booksIterator = this.books.iterator();
        System.out.println("Before Sort books");
        // Before Sort
        while (booksIterator.hasNext()) {
            book = (Book) booksIterator.next();
            System.out.println(book.getIsbn() + " -- " + book.getTitle() + " -- " + book.getReleaseDate());
        }

        // Add Logic below to Sort books by release date using sorting algorithm of your choice
        List<Book> listOfBook = new ArrayList<Book>(books);
        for(int i =0;i<listOfBook.size()-1;i++) {
        	if(listOfBook.get(i).getReleaseDate().compareTo(listOfBook.get(i+1).getReleaseDate())>0) {
        		Book tempBook = listOfBook.get(i);
        		listOfBook.set(i,listOfBook.get(i+1));
        		listOfBook.set(i+1, tempBook);
        		i = -1;
        	}
        }
        
        

        // After Sort
        booksIterator = listOfBook.iterator();
        System.out.println("\n\n\nAfter Sort books");
        while (booksIterator.hasNext()) {
            book = (Book) booksIterator.next();
            System.out.println(book.getIsbn() + " -- " + book.getTitle() + " -- " + book.getReleaseDate());
        }

    }
}