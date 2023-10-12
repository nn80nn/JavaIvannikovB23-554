package Sem2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2_20 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }

    public static void get10000(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.set(i, i + 1);
        }
    }

    public static void remove10000(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
    }
}