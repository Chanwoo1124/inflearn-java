package collection.link;



public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list= new MyLinkedListV1();
        System.out.println(list);

        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        list.add(0,"f");
        System.out.println(list);


    }
}
