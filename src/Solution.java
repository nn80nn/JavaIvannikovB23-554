import java.util.Scanner;

import static java.lang.Math.min;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Integer d;
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        System.out.println(Math.max(Math.max(x, y),Math.max(a, b)));
    }
}