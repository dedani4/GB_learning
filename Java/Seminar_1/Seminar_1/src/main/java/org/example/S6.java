package org.example;

import java.util.*;

public class S6 {
    public static void main(String[] args) {
        mySet set = new mySet();


        for(int i = 0; i<5;i++){
            set.add(new Random().nextInt(0,100));
        }
        if (set.contains(45)) System.out.println("3");
        System.out.println(Arrays.toString(set.toArray()));

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
        System.out.println();
        System.out.println(set.getItem(3));

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        myTreeSet treeSet = new myTreeSet(comparator);


        for(int i = 0; i<5;i++){
            treeSet.add(new Random().nextInt(0,100));
        }
        if (treeSet.contains(45)) System.out.println("3");
        System.out.println(Arrays.toString(treeSet.toArray()));

        Iterator<Integer> iterator1 = treeSet.iterator();
        while (iterator1.hasNext()) System.out.print(iterator1.next() + ", ");
        System.out.println();
        System.out.println(treeSet.getItem(3));

    }
}

class myTreeSet{

    private Comparator<Integer> comparator;

    public myTreeSet(Comparator<Integer> comp){
        comparator = comp;
    }

    private TreeMap<Integer,Object> map = new TreeMap<>(comparator);
    static final Object VAL = new Object();

    public boolean add(int num){
        return map.put(num,VAL) == null;
    }
    public boolean remove(int num){
        return !(map.remove(num) == null);
    }

    public boolean contains (int num){
        return map.containsKey(num);
    }

    public Object[] toArray(){
        return map.keySet().toArray();
    }

    public Iterator<Integer> iterator(){
        return map.keySet().iterator();
    }

    public Integer getItem(int index){
        return (Integer) toArray()[index];
    }

}

class mySet{


    private LinkedHashMap<Integer,Object> map = new LinkedHashMap<>();
    static final Object VAL = new Object();


    public boolean add(int num){
       return map.put(num,VAL) == null;
    }
    public boolean remove(int num){
        return !(map.remove(num) == null);
    }

    public boolean contains (int num){
        return map.containsKey(num);
    }

    public Object[] toArray(){
        return map.keySet().toArray();
    }

    public Iterator<Integer> iterator(){
        return map.keySet().iterator();
    }

    public Integer getItem(int index){
        return (Integer) toArray()[index];
    }

}
