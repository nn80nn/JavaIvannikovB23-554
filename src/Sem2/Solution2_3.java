import java.util.Scanner;
public class Solution2_3 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] strings = new String[10];
            int[] lengths = new int[10];

            for (int i = 0; i < 10; i++) {
                strings[i] = scanner.nextLine();
            }

            for (int i = 0; i < 10; i++) {
                lengths[i] = strings[i].length();
            }


            for (int i = 0; i < 10; i++) {
                System.out.println(lengths[i]);
            }
        }
    }

