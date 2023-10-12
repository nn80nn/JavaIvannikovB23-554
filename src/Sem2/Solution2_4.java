import java.util.Scanner;

public class Solution2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] houses = new int[15];
        int oddSum = 0;
        int evenSum = 0;

        System.out.println("Введите количество жителей в каждом доме:");
        for (int i = 0; i < 15; i++) {
            houses[i] = scanner.nextInt();
            if (i % 2 == 0) {
                evenSum += houses[i];
            } else {
                oddSum += houses[i];
            }
        }

        if (oddSum > evenSum) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else if (evenSum > oddSum) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными и четными номерами проживает одинаковое количество жителей.");
        }
    }
}