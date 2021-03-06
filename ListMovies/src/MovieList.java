import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MovieList {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int userCategoryChoice = 0; 
		String userContinueChoice = "y";
		
		ArrayList<Movie> movieList = new ArrayList();
		movieList.add(new Movie("Revenge of the Sith", "Sci-fi"));
		movieList.add(new Movie("Step Brothers", "Comedy"));
		movieList.add(new Movie("The Batman", "Action"));
		movieList.add(new Movie("The Dark Knight", "Action"));
		movieList.add(new Movie("Superbad", "Comedy"));
		movieList.add(new Movie("The Greatest Showman", "Musical"));
		movieList.add(new Movie("Avengers: Infinity War", "Action"));
		movieList.add(new Movie("Casino Royale", "Action"));
		movieList.add(new Movie("The Empire Strikes Back", "Sci-fi"));
		movieList.add(new Movie("Hairspray", "Musical"));
		
		movieList.sort(Comparator.comparing(Movie::getTitle));
		
		System.out.println("Hello! Welcome to David's finely curated movie list!");
		
		do {
		printMenu();
		System.out.println();
		System.out.print("Please enter your selection (1-5): ");
		userCategoryChoice = scnr.nextInt();
		
		System.out.println();
		
		if(userCategoryChoice == 1) {
			System.out.println("Comedy, a fantastic choice. I'd recommend the following films:");
		} else if (userCategoryChoice == 2) {
			System.out.println("Sci-fi! My favorite category. Try these out:");
		} else if (userCategoryChoice == 3) {
			System.out.println("Action! These recommendations should get your blood flowing:");
		} else if (userCategoryChoice == 4) {
			System.out.println("Drama? Really?");
		} else if (userCategoryChoice == 5) {
			System.out.println("Musicals? I suppose if you're in the mood for one, these ought to do the trick:");
		}
		
		for(int i = 0; i < movieList.size(); i++) {
			if (userCategoryChoice == 1 && movieList.get(i).getCategory() == "Comedy") {
				System.out.println(movieList.get(i).toString());
			} else if (userCategoryChoice == 2 && movieList.get(i).getCategory() == "Sci-fi") {
				System.out.println(movieList.get(i).toString());
			} else if (userCategoryChoice == 3 && movieList.get(i).getCategory() == "Action") {
				System.out.println(movieList.get(i).toString());
			} else if (userCategoryChoice == 4) {
				System.out.println("I don't recommend this.");
				break;
			} else if (userCategoryChoice == 5 && movieList.get(i).getCategory() == "Musical") {
				System.out.println(movieList.get(i).toString());
			}
		}
		System.out.println();
		System.out.print("Would you like to continue? (y/n): ");
		userContinueChoice = scnr.next().toLowerCase();
		System.out.println();
		
		} while (userContinueChoice.equals("y"));
		
	System.out.println("Thanks for having the good taste to use this app! Enjoy your movie night!");

	}
	
	public static void printMenu() {
		System.out.println("Please select one of the options below to receive movie recommendations for that category!");
		System.out.println("1. Comedy");
		System.out.println("2. Sci-fi");
		System.out.println("3. Action");
		System.out.println("4. Drama"); 
		System.out.println("5. Musical");
	}
	
	

}
