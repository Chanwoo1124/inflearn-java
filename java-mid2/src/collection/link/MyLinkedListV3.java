package collection.link;



public class MyLinkedListV3<E> {
    private Node<E> first;
    private int size = 0;


    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, E element) {
        Node<E>x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }


    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;

        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;

    }

    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;

        } else {
            Node node = getNode(index - 1);
            newNode.next = node.next;
            node.next = newNode;
        }
        size++;


    }

    public E remove(int index) {
        Node<E> removedNode = getNode(index);
        E item = removedNode.item;
        if (index == 0) {
            first = removedNode.next;

        } else {
            Node node = getNode(index - 1);
            node.next = removedNode.next;
        }
        removedNode.item = null;
        removedNode.next = null;
        size--;
        return (E) removedNode;
    }


    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {
        E item;
        Node next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");

                }
                x = x.next;
            }
            sb.append("]");

            return sb.toString();

        }
    }
}