public class MinMaxArray {
    public static void main(String[] args) {
        int[] x = { 100, 50, 40, 20, 110, 70, 60, 30, 90 };
        int minimum = x[0];
        int maximum = x[0];

        for (int i = 0; i < x.length; i++) {
            if (x[i] < minimum) {
                minimum = x[i];
            }
            if (x[i] > maximum) {
                maximum = x[i];
            }
        }
        System.out.println("Minimum element: " + minimum);
        System.out.println("Maximum element: " + maximum);
    }
}
