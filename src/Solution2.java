public class Solution2 {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        if (abs(10 - a) < abs(10 - b)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}