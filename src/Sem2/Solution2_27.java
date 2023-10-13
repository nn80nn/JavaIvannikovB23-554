package Sem2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2_27 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine()); }
        sort(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]); }
    public static void sort(int[] array) {
        int buf;
        for (int i = 0; i < 19; i++) {
            for (int j = i+1; j < 20; j++) {
                if (array[i] < array[j]) {
                    buf = array[j];
                    array[j] = array[i];
                    array[i] = buf;
                }
            }
        }
        }
    }