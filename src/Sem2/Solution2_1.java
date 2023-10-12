import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2_1 {
    public static void main(String[] args) throws Exception {

        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max); }
    public static int[] initializeArray() throws IOException { // создайте и заполните массив
        int [] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
    public static int max(int[] array) { // найдите максимальное значение
        int m = -2147483648;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > m) {
                m = array[i];
            }
        }
        return m;
    }
}