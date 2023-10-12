import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution2_13 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) {
                break;
            }
            strings.add(inputString);
        }


        for (String string : strings) {
            System.out.println(string);
        }
    }
}