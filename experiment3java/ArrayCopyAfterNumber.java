import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyAfterNumber {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 105 };
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number to check for: ");
        int numberToCheck = scanner.nextInt();

        int[] resultArray = copyElementsAfterNumber(arr, numberToCheck);

        if (resultArray.length > 0) {
            System.out.println("Arr 1 should have the elements: " + Arrays.toString(resultArray));
        } else {
            System.out.println("Number not found in the array.");
        }
    }

    public static int[] copyElementsAfterNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return Arrays.copyOfRange(array, i, array.length);
            }
        }
        return new int[0]; // Return empty array if number is not found
    }
}
