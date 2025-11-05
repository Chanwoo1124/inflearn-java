package collection.link;

import generic.test.ex2.PairTestGeneric;

public class NodeMain3 {
    public static void main(String[] args) {
        Node a = new Node("A");
        a.next = new Node("B");
        a.next.next = new Node("C");

        System.out.println(a);

        //모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(a);

        //마지막 노드 조회하기
        Node lastNode = getLastNode(a);
        System.out.println(lastNode.item);

        //특정 index의 노드 조회하기
        int index = 2;
        Node node=getNode(a,index);
        System.out.println(node);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(a,"D");
        add(a,"E");
        add(a,"F ");
        printAll(a);
    }


    private static void printAll(Node node) {
        Node x = node;
        while ( x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node a) {
        Node x = a;
        while (x.next != null){
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node a, int index) {
        Node x = a;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node a, String d) {
//        Node x = a;
//        while(x.next != null){
//            x = x.next;
//        }
//        x.next = new Node(d);
//
        Node node = getLastNode(a);
        node.next = new Node(d);

    }

}
