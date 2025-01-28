public class FindElement {
    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        int elementToFind = 22;
        int index = findElement(array, elementToFind);

        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found in the array");
        }
    }

    public static int findElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
