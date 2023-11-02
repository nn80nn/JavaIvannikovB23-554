package Sem3;

import java.util.ArrayList;

public class Solution3_6 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList = new ArrayList[3]; // Создаем массив списков строк размером 3

        // Заполняем каждый список строк данными
        arrayOfStringList[0] = new ArrayList<>();
        arrayOfStringList[0].add("Привет");
        arrayOfStringList[0].add("Мир");

        arrayOfStringList[1] = new ArrayList<>();
        arrayOfStringList[1].add("Программирование");
        arrayOfStringList[1].add("это");
        arrayOfStringList[1].add("весело");

        arrayOfStringList[2] = new ArrayList<>();
        arrayOfStringList[2].add("Java");
        arrayOfStringList[2].add("является");
        arrayOfStringList[2].add("отличным");
        arrayOfStringList[2].add("языком");

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}