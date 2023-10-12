import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution2_7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        list = tr(list);
        for (String x : list) {
            System.out.println(x);
        }
    }
    private static ArrayList<String> tr(ArrayList<String> lst) {
        for (int j = 0; j < 13; j++) {
            lst.add(0, lst.get(4));
            lst.remove(5);
        }
        return lst;
    }
}
