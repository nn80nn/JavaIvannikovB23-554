public class Solution2_14 {
    public static void main(String[] args) {
        int count = 30;

        while (count >= 0) {
            System.out.println(count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count--;
        }

        System.out.println("Бум!");
    }
}