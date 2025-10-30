package nested.test;

public class OuterClass3Main {
    public void myMythod(){
        class LocalClass{
            public void hello(){
                System.out.println("hello");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.hello();

    }
}
