package experiment2Java;

import java.util.Scanner;

public class prime_no_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, Y, N;
        System.out.println("Enter the range of numbers");
        while (true) {
            System.out.print("Enter lower limit (X): ");
            X = scanner.nextInt();
            System.out.print("Enter upper limit (Y): ");
            Y = scanner.nextInt();
            System.out.print("Enter no. of prime nos.(N): ");
            N = scanner.nextInt();

            if (X > 0 && Y > 0 && N > 0 && Y > X) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }

        int count = 0;
        for (int i = X; i <= Y && count < N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }

        if (count < N) {
            System.out.println("There are less than " + N + " prime nos. in given range.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
