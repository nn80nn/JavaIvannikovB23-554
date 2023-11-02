package Sem3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution3_5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        Map<Character, Integer> letterCount = new TreeMap<>();
        for (Character letter : alphabet) {
            letterCount.put(letter, 0);
        }

        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            for (char c : line.toCharArray()) {
                if (alphabet.contains(Character.toLowerCase(c))) {
                    letterCount.put(Character.toLowerCase(c), letterCount.get(Character.toLowerCase(c)) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}