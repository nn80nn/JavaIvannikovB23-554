import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution2_10 {
    public static void main(String[] args) throws Exception {
// Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);
// Вывести на экран result
        for (String x : result) {
            System.out.println(x);
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> nlist = new ArrayList<String>();
        for (String x : list) {
            nlist.add(x);
            nlist.add(x);
        }
        return nlist;
    }
}