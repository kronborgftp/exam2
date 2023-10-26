import seven.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //seven
        // Creating Keyword objects
        Keyword java = new Keyword("Java", "A high-level programming language");
        Keyword python = new Keyword("Python", "An interpreted, high-level, general-purpose programming language");
        // Establishing a relationship between keywords
        java.addSeeAlsoKeyword(python);
        // Asking the user for input
        System.out.print("Enter a search term: ");
        String searchTerm = scanner.nextLine();
        // Checking if the search term matches and printing information accordingly
        if (java.matches(searchTerm)) {
            java.printInfo();
        } else {
            System.out.println("No matching keyword found.");
        }


    }

}
