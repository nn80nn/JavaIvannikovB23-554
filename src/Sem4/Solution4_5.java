package Sem4;

public class Solution4_5 {
    public static void main(String[] args) {
        int minInt = min(5, 10);
        long minLong = min(100, 200);
        double minDouble = min(3.14, 2.71);

        System.out.println(minInt);
        System.out.println(minLong);
        System.out.println(minDouble);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static long min(long a, long b) {
        return Math.min(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }
}