package _18_generic;

public class MyMap<K,V> {
    private K key;
    private V value;

    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyMap<Integer,String> myMap1 = new MyMap(1,"one");

        System.out.println(myMap1.getValue());

        System.out.println(myMap1.getKey());
    }

}
