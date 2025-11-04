package collection.array;

import java.util.Arrays;

public class MyArrayListV1<E> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayListV1(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }
    public void add(E e){
        elementData[size] = e;
        size++;
    }

    public E get(int index){
        return (E) elementData[index];
    }

    public E set(int index, E element){
        E o = get(index);
        elementData[index] = element;
        return o;
    }

    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }

        }
        return -1;
    }
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData,size)) +
                " size =" + size + ", copacity=" + elementData.length;

    }

}
