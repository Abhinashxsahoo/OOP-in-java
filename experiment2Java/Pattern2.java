/* Write a program to print the following patterns: 
 A B C D E
 A B C D
 A B C
 A B
 A
 
 For the input 5*/
package experiment2Java;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();
        System.out.print("Pattern: \n");
        for (int i = n; i >= 1; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
