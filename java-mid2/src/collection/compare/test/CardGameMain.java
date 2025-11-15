package collection.compare.test;

import java.util.Collections;
import java.util.List;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int i = 1; i < 14; i++) {
            deck.add(new Card(i, "\u2660"));
            deck.add(new Card(i, "\u2665"));
            deck.add(new Card(i, "\u2666"));
            deck.add(new Card(i, "\u2663"));
        }
        System.out.println(deck);
        deck.shuffle();
        Player player1 = new Player();
        Player player2 = new Player();

        for (int i = 0; i < 5; i++) {
            player1.add(deck.getCard(i));
            player2.add(deck.getCard(i+10));
        }
        player1.sumResult();
        player2.sumResult();
        System.out.println(player1);
        System.out.println(player2);

    }
}
