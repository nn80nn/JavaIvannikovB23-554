package Sem2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Solution2_28 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < 20; i++) set.add(reader.readLine());
        System.out.println(set);
        for (String s:set) System.out.println(s);
    }
}
