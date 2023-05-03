package org.example;

import java.util.HashMap;
import java.util.Map;

public class S5_homework {
    public static void main(String[] args) {
//        Создать множество, ключ и значение строки. Добавить шесть элементов.
        Map<String,String> map1 = new HashMap<>();
        map1.put("xxx", "Oleg");
        map1.put("zzz", "Kolya");
        map1.put("yyy", "Ivan");
        map1.put("qqq", "John");
        map1.put("rrr", "Merlin");
        map1.put("sss", "Manson");
//        Вывести в консоль значения.
        System.out.println(map1.values());
//        Добавить ко всем значениям символ "!".
        map1.forEach((k,v) -> map1.compute(k, (k1,v1) -> v1 + "!"));
        System.out.println(map1.values());
//        Создать второе множество с таким же обобщением.
//        Ключи второго множества частично совпадают с ключами первого.
        Map<String,String> map2 = new HashMap<>();
        map2.put("aaa", "Huan");
        map2.put("zzz", "Rashid");
        map2.put("bbb", "Achiles");
        map2.put("qqq", "Jesus");
        map2.put("ccc", "Muhamed");
        map2.put("sss", "Ali");
//        Объеденить значания во втором множестве и первом если ключи совподают.
        for(String key2: map2.keySet()){
            for(String key1: map1.keySet()){
                if (key2.equals(key1)){
                    map2.merge(key2, map1.get(key1), String::concat);
                }
            }
        }
//        Вывести результат в консоль.
        System.out.println(map2);


    }


}
