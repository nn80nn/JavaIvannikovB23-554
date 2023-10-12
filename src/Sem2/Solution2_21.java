package Sem2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2_21 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List<Object> list) {
        long startTime = System.currentTimeMillis();

        insert10000(list);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void insert10000(List<Object> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
