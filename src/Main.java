import seven.*;
import eight.*;

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

        //eight------------------------------------------------------------
        Card card1 = new Card("hearts", 7);
        Card card2 = new Card("spades", 7);

        System.out.println("Card 1 beats Card 2: " + card1.beats(card2));


    }

}
