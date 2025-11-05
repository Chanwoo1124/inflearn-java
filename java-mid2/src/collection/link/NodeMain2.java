package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        Node a = new Node("A");
        a.next = new Node("B");
        a.next.next = new Node("C");

        System.out.println("연결된 노드 출력하기");
        System.out.println(a);
    }
}
