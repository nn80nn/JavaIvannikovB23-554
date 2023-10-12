package Sem2;

import java.util.HashSet;
import java.util.Set;

public class Solution2_17 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String element : set) {
            System.out.println(element);
        }
    }
}