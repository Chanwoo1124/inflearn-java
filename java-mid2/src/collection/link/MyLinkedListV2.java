package collection.link;



public class MyLinkedListV2 {
    private Node first;
    private int size = 0;


    public void add(Object e){
        Node newNode = new Node(e);
        if (first == null){
            first = newNode;
        }else{
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode(){
        Node x = first;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object element){
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index){
        Node node = getNode(index);
        return  node.item;
    }


    private Node getNode(int index){
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;

        }
        return x;
    }
    public int indexOf(Object o){
        int index = 0;
        for (Node x = first; x != null; x = x.next){
            if (o.equals(x.item)){
                return index;
            }
            index++;
        }
        return -1;

    }
    //add 추가 코드 오버로딩
//    public Object add(int index,Object e){
//        Node x = first;
//        if(index == 0){
//            first = new Node(e);
//            first.next = x;
//        }
//        Node node = new Node(e);
//        for (int i = 0; i < index; i++) {
//
//        }
//
//
//        size++;
//
//        return null;
//    }
    public void add(int index, Object e){
        Node newNode = new Node(e);
        if(index == 0){
            newNode.next = first;
            first = newNode;

        }else{
            Node node = getNode(index-1);
            newNode.next = node.next;
            node.next = newNode;
        }
        size++;
            
            
    }
    public Object remove(int index){
        Node removedNode = getNode(index);
        Object item = removedNode.item;
        if (index == 0){
            first = removedNode.next;

        }else{
            Node node = getNode(index - 1);
            node.next = removedNode.next;
        }
        removedNode.item = null;
        removedNode.next = null;
        size--;
        return removedNode;
    }




    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
