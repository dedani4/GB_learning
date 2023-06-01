package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class S4_homework {
    public static void main(String[] args) {
        //task1
        writeFile(input(0), input(1));
        readFile(input(2));
        //task2



    }

    private static String input(int count){
        Scanner in = new Scanner(System.in);
        if (count == 0) System.out.println("Input string to write: ");
        if (count == 1) System.out.println("Input file name to write: ");
        if (count == 2) System.out.println("Input file name to read: ");
        return in.nextLine();
    }

    private static void writeFile(String text, String file){
        try(FileWriter writer = new FileWriter(file, false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void readFile(String file){
        try(FileReader reader = new FileReader(file))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
