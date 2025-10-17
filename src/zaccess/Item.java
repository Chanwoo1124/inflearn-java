package zaccess;

public class Item {
    private String menu;
    private int m;

    public  Item(String menu, int m, int i) {
        this.menu = menu;
        this.m  = m * i;
    }

    public String getMenu() {
        return menu;
    }

    public int getM() {
        return m;
    }

}