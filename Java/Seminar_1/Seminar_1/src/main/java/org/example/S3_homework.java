package org.example;

import java.util.*;

public class S3_homework {

    public static void main(String[] args) {
        task1Int(randomIntList(0, 50, 10));
        task1Str(randomStrList(5, 10));
        task2(randomIntList(5,55,10));
        task3(randomIntList(1,10,10));
        task4(randomIntList(0,10,5), randomIntList(0,10,5));
        task7(task5(),task6());
    }

    private static ArrayList<Integer> randomIntList(int min, int max, int size){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            list.add(new Random().nextInt(min, max));
        }
        return list;
    }

    private static ArrayList<String> randomStrList(int stringSize, int size){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < stringSize; j++){
                str.append((char) new Random().nextInt(97, 99));
            }
            list.add(str.toString());
        }
        return list;
    }
    private static void task1Int (List<Integer> list1){
        System.out.println("Task 1 Integer:");
        System.out.println(list1);
        list1.sort((integer, t1) -> t1 - integer);
        System.out.println(list1);
    }
    private static void task1Str (List<String> list){
        System.out.println("Task 1 String:");
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }

    private static void task2(List<Integer> list){
        System.out.println("Task 2:");
        System.out.println(list);
        list.removeIf(n -> (n%2==0));
        System.out.println(list);
    }

    private static void task3(List<Integer> list){
        System.out.println("Task 3:");
        System.out.println(list);
        int sum = 0;
        for (var n: list) sum += n;
        System.out.printf("min: %d  max: %d  avg: %.2f\n",
                Collections.min(list),Collections.max(list), (double)sum/list.size());
    }

    private static void task4(List<Integer> list1, List<Integer> list2){
        System.out.println("Task 4:");
        System.out.print(list1);
        System.out.println(list2);
        list2.removeAll(list1);
        list1.addAll(list2);
        System.out.println(list1);
    }

    private static long task5(){
        System.out.println("Task 5:");
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i<10000; i++){
            list.add(0,0);
        }
        long end = System.currentTimeMillis();
        System.out.println(list);
        return end-start;
    }

    private static long task6(){
        System.out.println("Task 6:");
        LinkedList<Integer> list = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i<10000; i++){
            list.add(0,0);
        }
        long end = System.currentTimeMillis();
        System.out.println(list);
        return end-start;
    }

    private static void task7(long resArrList, long resLinList){
        System.out.println("Task 7:");
        System.out.printf("ArrayList duration: %d\n",resArrList);
        System.out.printf("LinkedList duration: %d\n",resLinList);
    }
}
