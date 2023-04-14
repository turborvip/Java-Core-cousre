package _16_data_structures_and_algorithms._array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    //number of element of arraylist
    private static final int DEFAULT_CAPACITY = 10;
    //Suc chua mac dinh cua array list
    Object elements[];
    //Mang doi tuong elements chua cac phan tu trong array list

    public MyArrayList() {
        System.out.println("Khoi tao thanh cong MyArrayList co kich thuoc la " + DEFAULT_CAPACITY);
        elements = new Object[DEFAULT_CAPACITY];
    }

    /*
     * Phuong thuc khoi tao voi kich thuoc mang duoc truyen vao la tham so capacity
     * @param capacity
     * */

    public MyArrayList(int capacity) throws IllegalAccessException {
        if (capacity > 0) {
            System.out.println("Khoi tao thanh cong MyArrayList co kich thuoc la " + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Error capacity!!!");
            throw new IllegalAccessException("capacity : " + capacity);
        }

    }

    public void ensureCapacity(int minCapacity) throws IllegalAccessException {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Khoi tao thanh cong voi kich thuoc la :" + elements.length);
        } else {
            throw new IllegalAccessException("minCapacity : " + minCapacity);
        }
    }

    public int size() {
        return size;
    }

    public int length(){
        return elements.length;
    }

    public E get (int index){
        return (E) elements[index];
    }

    public boolean add(E e) throws  IllegalAccessException{
        if(size == elements.length){
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void add(E e,int index) throws IllegalAccessException{
        if (index > elements.length) {
            throw new IllegalAccessException("index :" + index);
        } else if (elements.length == index + 1) {
            ensureCapacity(1);
        }

        if(elements[index] == null){
            size ++;
            elements[index] = e;
        }else{
            if(size == elements.length){
                ensureCapacity(1);
            }
            System.arraycopy(elements,index,elements,index + 1 , size - index );
            elements[index] = e;
            size ++;
        }
    }

    public E remove(int index) throws IllegalAccessException{
        if (index < 0 || index > elements.length) {
            throw new IllegalAccessException("Error index :" + index);
        }
        E element = (E) elements[index];
        for(int i = index ; i < size - 1; i++){
            elements[i] = elements[i+1];
        }

        elements[size-1] = null;
        size --;
        return element;
    }

    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(elements,size);
        v.size = size;
        return v;
    }

    public int indexOf(E e){
        int index = -1 ;
        for (int i = 0; i < size; i++) {
            if(this.elements[i].equals(e)){
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean contains(E e){
        return this.indexOf(e) >= 0;
    }

    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
