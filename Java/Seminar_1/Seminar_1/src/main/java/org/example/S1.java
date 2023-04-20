package org.example;

import java.util.Random;

public class S1 {
    public static void main(String[] args) {
        int min = 0;
        int max = 2000;

        int i = randomNumber(min, max);
        System.out.printf("Task 1. Random number from 0 to 2000 i = %d\n", i);

        int n = mostSignificantBit(i);
        System.out.printf("Task 2. MSB - n = %d\n", n);

        int[] m1 = multipleNumbers(i, n);
        System.out.printf("Task 3. Numbers multiple of %d from %d to %d are: ", n, i, Short.MAX_VALUE);
        for (int j = 0; j<m1.length; j++){
            if (j == m1.length-1) System.out.printf("%d.\n", m1[j]);
            else if (j < 3 || j > m1.length-4) System.out.printf("%d ", m1[j]);
            else if (j == 3) System.out.print(" ... ");
        }

        int[] m2 = nonMultipleNumbers(i, n);
        System.out.printf("Task 4. Numbers not multiple of %d from %d to %d are: ", n, Short.MIN_VALUE, i);
        for (int j = 0; j<m2.length; j++){
            if (j == m2.length-1) System.out.printf("%d.\n", m2[j]);
            else if (j < 3 || j > m2.length-4) System.out.printf("%d ", m2[j]);
            else if (j == 3) System.out.print(" ... ");
        }
    }

    private static int randomNumber(int min, int max){
        return new Random().nextInt(min, max);
    }

    private static int mostSignificantBit(int i){
        String binaryI = Integer.toBinaryString(i);
        return binaryI.length();
    }

    private  static int[] multipleNumbers(int i, int n){
        int[] result = new int[0];
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0) result = addElementToArray(j, result);
        }
        return result;
    }

    private  static int[] nonMultipleNumbers(int i, int n){
        int[] result = new int[0];
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j % n != 0) result = addElementToArray(j, result);
        }
        return result;
    }

    private static int[] addElementToArray (int element, int[] array){
        int[] new_array = new int[array.length + 1];
        System.arraycopy(array, 0, new_array, 0, array.length);
        new_array[new_array.length-1] = element;
        return new_array;
    }
}
