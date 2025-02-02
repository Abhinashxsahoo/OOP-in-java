import java.util.Arrays;

public class ArrayEqualityChecker {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 105 };
        int[] arr1 = { 10, 20, 30, 40, 50, 60, 70, 105 };

        if (areArraysEqual(arr, arr1)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1 == null && array2 == null) {
            return true;
        }

        if (array1 == null || array2 == null) {
            return false;
        }

        return Arrays.equals(array1, array2);
    }
}
