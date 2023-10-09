import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2_2 {
    public static void main(String[] args) throws Exception {
    String[] strarray = new String[10];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < strarray.length-2; i++) {
        strarray[i] = reader.readLine();
        }
    for (int i = strarray.length-1; i >= 0; i--) {
            System.out.println(strarray[i]);
        }
    }
}
