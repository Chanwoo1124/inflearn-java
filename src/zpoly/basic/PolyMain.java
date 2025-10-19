package zpoly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent paren = new Parent();
        paren.parentMethod();
        instanceo(paren);

        Parent child = new Child();
        child.parentMethod();
        instanceo(child);



    }
    public static void instanceo(Parent parent){
        if (parent instanceof Child child){     // 매개변수의 참조값에 Child인스턴스가 있으면
            child.childMethod();                // Child 타입으로 child라는 변수를 만듬
        }else {
            System.out.println("child 인스턴스가없습니다.");
        }
    }
}
