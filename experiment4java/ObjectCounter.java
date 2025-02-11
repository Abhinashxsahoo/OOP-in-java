class ObjectCounter {
    // Static variable to keep track of the number of objects
    private static int count = 0;

    // Constructor that increments the count when an object is created
    public ObjectCounter() {
        count++;
    }

    // Static method to return the number of objects created
    public static int getObjectCount() {
        return count;
    }

    public static void main(String[] args) {
        // Creating objects
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Printing the number of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}
// Output: