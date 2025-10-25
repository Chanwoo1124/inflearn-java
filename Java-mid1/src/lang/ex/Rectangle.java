package lang.ex;

public class Rectangle {
    int width;
    int height;
    public Rectangle(int i , int j) {
        this.width = i;
        this.height = j;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o ) {
        Rectangle r = (Rectangle) o;
        if (this.width == r.width && this.height == r.height) {
            return true;
        } else return false;
    }
}
