package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rows = 5;
        int columns = 6;
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(100);

            }

        }

        System.out.println("Введите число,которое хотите добавить: ");
        int numbers = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] += numbers;

            }
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];

            }

        }
        System.out.println(Arrays.deepToString(array));
    }
}
