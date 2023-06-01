package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class S3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("Hello");
        list.add(1, "world");

        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Hello");
        list1.add(1, "world");

        System.out.println(list1 == list);
        System.out.println(list1.equals(list));
        System.out.println(list1.get(0) == list.get(0));
        System.out.println(list1.get(0).equals(list.get(0)));

        String word = "Hello";
        String word1 = "Hello";
        System.out.println(word == word1);
        System.out.println(word.equals(word1));

        list.hashCode();

        list1.sort(Comparator.naturalOrder());


    }
}
