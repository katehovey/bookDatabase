import java.util.Scanner;

public class bookDatabase {
	public static Scanner input = new Scanner(System.in); 
	public static boolean runProgram = true;
	
	public static void main(String[] args) {
		
		Book newBook = new Book();
		
		while (runProgram == true) {
			System.out.println("Time to enter a book!");
			System.out.println("*Press enter to continue*");
			String space = input.nextLine();
			
			// ^I wasn't really sure why, but whenever I would enter a second book it would for some reason skip the first question. This was the way I could think of to fix it
			
			System.out.println("What is the name of the book?");
			String name = input.nextLine();
			
			System.out.println("Who is the author of this book?");
			String authour = input.nextLine();
			
			System.out.println("What is the genre of this book?");
			String genre = input.nextLine();
			
			System.out.println("How many pages are in this book?");
			int pages = input.nextInt();
			
			System.out.println("You have entered the " + genre + " book '" + name + "' by " + authour + ", which has " + pages + " pages.");
			newBook.addBook();
			
			System.out.println("Would you like to enter another book?");
			System.out.println("*Press 1 for yes, press 2 for no*");
			int enterAgain = input.nextInt();
			
			if (enterAgain == 1) {
				runProgram = true;
			}
			if (enterAgain == 2) {
				runProgram = false;
				System.out.println("You entered a total of " + newBook.totalBooks() + " books into the database. Thank you!");
			}
		}
		

	}

}
