package org.example;

public class S2 {
    public static void main(String[] args) {
        String str = "Основание -126 степень 7";
        String str2 = "Основание_-96, степень/ 5";
        task1(str);
        task1(str2);

        System.out.println();
        task2(str, "Основание", "Exponentiation base", 0, 9);
    }

    private static void task1(String str){
        long result = exponentNumber(parseString(str));
        System.out.printf("%s, %d\n", str, result);
    }

    private static int[] parseString(String str){
        int[] result = new int[2];
        int i =0;
        String[] words = str.split("[, ?.@_/]+");
        for (String a: words){
            if (isDigit(a) && i<2) {
                result[i] = Integer.parseInt(a);
                i++;
            }
        }
        return result;
    }

//    Этот метод подглядел в интернете
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private static long exponentNumber(int[] numbers){
        return (long)Math.pow(numbers[0],numbers[1]);
    }
    
    private static void task2(String str, String toReplace, String replacement, int start, int end){
        replaceString(str, toReplace, replacement);
        replaceStringBuilder(str, start, end, replacement);
    }

    private static void replaceString(String str, String toReplace, String replacement){
        long begin = System.currentTimeMillis();
        System.out.println(begin);
        System.out.println(str);
        System.out.println(str.replaceAll(toReplace, replacement));
        long finish = System.currentTimeMillis();
        System.out.println(finish);
        System.out.printf("Replace of class String duration is: %d\n\n", finish - begin);
    }
    
    private static void replaceStringBuilder(String str, int start, int end, String replacement){
        long begin = System.currentTimeMillis();
        System.out.println(begin);
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.replace(start, end, replacement));
        long finish = System.currentTimeMillis();
        System.out.println(finish);
        System.out.printf("Replace of class StringBuilder duration is: %d\n\n", finish - begin);
    }
}
