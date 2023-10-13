package Sem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution2_24 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            lst.add(Integer.valueOf(reader.readLine()));
        }
        System.out.println(mlength(lst));

    }
    public static int mlength(ArrayList<Integer> list) {
        int k = 1, k1 = 0;
        for (int l = 1; l < 10; l++) {
            if (list.get(l) == list.get(l-1)) {
                k++;
            } else {
                if (k1 < k) k1 = k;
                k = 1;
            }
        }
        return k1;
    }
}
