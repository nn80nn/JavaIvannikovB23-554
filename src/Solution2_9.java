import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution2_9 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        tr(list);
    }
    private static void tr(ArrayList<String> lst) {
        for (int j = 0; j < 9; j++) {
            if ((lst.get(j + 1).length() >= lst.get(j).length()) == false) {
                System.out.println(lst.get(j+1));
                break;
            }
        }
    }
}
