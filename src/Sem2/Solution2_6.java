import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2_6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }
    public static void sort(int[] array) {
        int buf;
        for (int j = 0; j < 20; j++) {
            for (int k = 0; k < 20; k++) {
                if (array[j] > array[k]) {
                    buf = array[j];
                    array[j] = array[k];
                    array[k] = buf;
                }
            }
        }
        }
    }