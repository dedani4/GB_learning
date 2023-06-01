package org.example;

import java.util.*;

public class S5 {

    public static void main(String[] args) {

        ArrayList<String> list;


        Map<String, String> map = new HashMap<>();

        map.put("two", "два");
        map.put("three", "три");
        map.put("six", "шесть");

//        System.out.println(map.get("two"));
//        String str= map.get("tw");
//        System.out.println(str);
//
//        map.remove("six");

//        for (String key: map.keySet()){
//            System.out.println(map.get(key));
//        }
//        Iterator<String> iterat = map.keySet().iterator();
//        while (iterat.hasNext()){
//            String key = iterat.next();
//            System.out.println(map.get(key));
//        }

        System.out.println("replace " + map.replace("two", "2"));
        System.out.println("replace " + map.replace("three", "три", "3"));


        Set<String> keys = map.keySet();
        for(int i = 0; i<keys.size(); i++){
            System.out.println(map.get(keys.toArray()[i]));
        }
        map.putIfAbsent("six", "шесть");

        map.compute("six", (k,v) -> v + "!");
        map.computeIfAbsent("seven", (k) -> Integer.toString((int)(3.5*2)));

        System.out.println(map.getOrDefault("six", "000"));
        map.forEach((k,v) -> System.out.println(k + " " + v));





    }
}
