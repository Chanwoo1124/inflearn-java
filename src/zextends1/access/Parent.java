package zextends1.access;

public class Parent {

    public  int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public  void printParent(){
        System.out.println("publicValue = " + publicValue);
    }
}
