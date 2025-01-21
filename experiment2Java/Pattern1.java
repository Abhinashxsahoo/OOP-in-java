package experiment2Java;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("\nPattern:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("*");
            } else {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
