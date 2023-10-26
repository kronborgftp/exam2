import seven.*;
import eight.*;
import nine.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //seven------------------------------------------------------
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

        //NINE-------------------------------------------------------------------------
        Bil bil = new Bil(2500);
        System.out.println("weight:" + bil.getWeight());


        Trailer trailer = new Trailer(1000);
        System.out.println("trailer weight: " + trailer.getWeight());

        //tilkobl trailer
        bil.tilkobTrailer();

        //beregn og udskriv total weight
        System.out.println("Total weight: " + bil.getTotalWeight());
    }

}
