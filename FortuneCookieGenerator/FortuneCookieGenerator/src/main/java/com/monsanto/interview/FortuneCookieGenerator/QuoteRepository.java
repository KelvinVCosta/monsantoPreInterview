package com.monsanto.interview.FortuneCookieGenerator;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class QuoteRepository {

    //Changed quotes to final
    //Added serialVersionUID
    private static final List<String> QUOTES = new ArrayList<String>() {
        private static final long serialVersionUID = 3109256773218160485L;
        {
            add("A friend asks only for your time not your money.");
            add("If winter comes, can spring be far behind?");
            add("A smile is your passport into the hearts of others.");
            add("Enjoy the good luck a companion brings you.");
            add("The greatest risk is not taking one.");
            add("Land is always on the mind of a flying bird.");
            add("You must try, or hate yourself for not trying.");
            add("You can make your own happiness.");
            add("You can learn much from people who are different from you.");
            add("To achieve wisdom, you must first desire it.");
        }
    };

    public String getRandomQuote() {
        return QUOTES.get((int) (Math.random() * QUOTES.size()));
    }

}
