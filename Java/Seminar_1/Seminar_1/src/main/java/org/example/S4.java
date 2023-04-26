package org.example;

import java.io.*;
import java.util.*;

public class S4 {
    public static void main(String[] args) {

        writeFile(input());  // сохраняем строку в файл people.txt
        readFile();  // загружаем строки из файла people.txt и выводим в консоль
        peopleList();  // выводим список и сортируем по возрасту
    }

    private static String input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию, имя, отчество, возраст, пол через пробел: ");
        return in.nextLine();
    }

    private static void writeFile(String text){
        try(FileWriter writer = new FileWriter("people.txt", true))
        {
            writer.write('\n');
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void readFile(){
        try(FileReader reader = new FileReader("people.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
            System.out.println();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }


    private static void peopleList (){
        ArrayList<String> lastname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Character> sex = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        loadFile(lastname,name,patronymic,age,sex,id);

        output(lastname,name,patronymic,age,sex,id);

        output(lastname,name,patronymic,age,sex,bubbleSortByAge(age, id));
    }

    private static void loadFile(ArrayList<String> lastname, ArrayList<String> name,
                                 ArrayList<String> patronymic, ArrayList<Integer> age,
                                 ArrayList<Character> sex, ArrayList<Integer> id){
        try(FileReader ch = new FileReader("people.txt"))
        {
            BufferedReader reader = new BufferedReader(ch);
            String line = reader.readLine();
            int i = 0;
            while(line!=null){
                String[] lineArr = line.split(" ");
                lastname.add(lineArr[0]);
                name.add(lineArr[1]);
                patronymic.add(lineArr[2]);
                age.add(Integer.parseInt(lineArr[3]));
                sex.add(lineArr[4].charAt(0));
                id.add(i++);
                line = reader.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Integer> bubbleSortByAge(ArrayList<Integer> age, ArrayList<Integer> id){
        ArrayList<Integer> age_copy = new ArrayList<>(age);
        ArrayList<Integer> id_copy = new ArrayList<>(id);
        for (int i = 0; i < age_copy.size()-1; i++){
            for (int j = 0; j < age_copy.size() - i - 1; j++){
                if (age_copy.get(j) > age_copy.get(j+1)){
                    Collections.swap(age_copy, j, j+1);
                    Collections.swap(id_copy, j, j+1);
                }
            }
        }
        return id_copy;
    }

    private static void output (ArrayList<String> lastname, ArrayList<String> name,
                                ArrayList<String> patronymic, ArrayList<Integer> age,
                                ArrayList<Character> sex, ArrayList<Integer> id){
        System.out.println("\nСписок людей");
        for (var i: id){
            System.out.printf("%s %s.%s. %d %s\n", lastname.get(i),  name.get(i).charAt(0),
                    patronymic.get(i).charAt(0), age.get(i), sex.get(i));
        }
    }

}
