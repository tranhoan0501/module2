package _10_DSA_ArrayList_LinkedList.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private int DEFAULT_CAPACITY = 10;
    private E[] elements;

    MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    MyList(int initialCapacity) {
        elements = (E[]) new Object[initialCapacity];
    }
    private void ensureCapacity() {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2);
        }
    }
    private void clear() {
        size = 0;
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        for (int i = size; i > index; i--){
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }
    boolean add(E e){
        add(size, e);
        return true;
    }
    public E remove(int index){
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E res = elements[index];
        if(size > 1){
            E[] tmp = (E[]) new Object[size - 1];
            for (int i = 0, j = 0; i < size; i++) {
                if (i != index) {
                    tmp[j++] = elements[i];
                }
            }
            elements = tmp;
            size--;
        }
        else{
            clear();
        }
        return res;
    }
    public int size() {
        return size;
    }
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

