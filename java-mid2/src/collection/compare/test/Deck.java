package collection.compare.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();

    public void add(Card card){
        deck.add(card);
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card getCard(int i) {
        return deck.get(i);
    }

    public void Shot(){
        deck.sort(null);
    }

    @Override
    public String toString() {
        return ""+ deck;
    }
}
