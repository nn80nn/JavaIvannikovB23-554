import java.util.ArrayList;
import java.util.Scanner;

public class Solution2_5 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        int maxLength = 0;
        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }

        System.out.println("Самая длинная строка(ы):");
        for (String str : strings) {
            if (str.length() == maxLength) {
                System.out.println(str);
            }
        }
    }
}