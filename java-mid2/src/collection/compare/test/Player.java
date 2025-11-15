package collection.compare.test;

import java.util.ArrayList;
import java.util.Deque;

public class Player{
    ArrayList<Card> cards = new ArrayList<>();
    private int result;

    public void add(Card card){
        cards.add(card);

    }

    public void shot(){
        cards.sort(null);
    }

    public void sumResult(){
        for (int i = 0; i < 5; i++) {
             result += cards.get(i).getI();
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "cards=" + cards +
                ", result=" + result +
                '}';
    }
}


