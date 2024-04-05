package HomeWork;

import java.util.Scanner;

public class TaskStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбиков");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = k;
                    k++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    array[i][j] = k;
                    k++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}