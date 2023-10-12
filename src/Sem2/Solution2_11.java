import java.util.ArrayList;

public class Solution2_11 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> fixedStrings = new ArrayList<String>();
        for (String string : strings) {
            if (string.contains("р") && string.contains("л")) {
                fixedStrings.add(string);
            } else if (string.contains("р")) {
                // Do nothing, skip the word
            } else if (string.contains("л")) {
                fixedStrings.add(string);
                fixedStrings.add(string);
            } else {
                fixedStrings.add(string);
            }
        }
        return fixedStrings;
    }
}