package seven;

import java.util.*;


public class Keyword {
    Scanner keyboard = new Scanner(System.in).useLocale(Locale.UK);

    private String word;
    private String definition;
    private List<Keyword> seeAlso;

    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
        this.seeAlso = new ArrayList<>();
    }

    public boolean matches(String searchTerm) {
        return word.toLowerCase().contains(searchTerm.toLowerCase());
    }

    public void addSeeAlsoKeyword(Keyword keyword) {
        seeAlso.add(keyword);
    }

    public void printInfo() {
        System.out.println("Word: " + word);
        System.out.println("Definition: " + definition);
        if (!seeAlso.isEmpty()) { //check if the list isnt empty
            System.out.println("See Also:");
            for (Keyword keyword : seeAlso) {
                System.out.println("- " + keyword.word);
            }
        }

    }

}
