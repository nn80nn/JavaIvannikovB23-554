/*import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;

public class Solution2_5Test {

    @Test
    public void testMain() {
        String input = "string1\nstring2\nstring3\nstring4\nstring5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        List<String> expectedStrings = Arrays.asList("string1", "string2", "string3", "string4", "string5");

        List<String> actualStrings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            actualStrings.add(scanner.nextLine());
        }
        scanner.close();

        assertEquals(expectedStrings, actualStrings);
    }
}*/