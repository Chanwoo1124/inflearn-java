package collection.compare.test;

public class Card implements Comparable<Card>{
    private int i;
    private String m;

    public Card(int i, String m) {
        this.i = i;
        this.m = m;
    }

    public int getI() {
        return i;
    }

    @Override
    public String toString() {
        return i+"("+m+")";
    }

    @Override
    public int compareTo(Card o) {
        return this.i<o.i? -1 :(this.i == o.i? 0:1 );
    }
}
