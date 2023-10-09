public class Solution4 {
    public static void main(String[] args) {
        Integer a = 1, b = 1, k = 0;
        while (a < 11) {
            k = 0;
            b = 0;
            while (k < 10) {
                k++;
                b +=a;
                System.out.printf("%d ", b);
            }
        a++;
        System.out.println();
        }
    }
}