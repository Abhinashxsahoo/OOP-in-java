class Employee {
    String name;
    int yearOfJoining;
    String address;

    // Constructor to initialize the attributes
    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Method to print the employee details
    public void printDetails() {
        System.out.println(name + "\t" + yearOfJoining + "\t" + address);
    }

    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("Ujwal", 2024, "BBS");
        Employee emp2 = new Employee("Ravi", 2023, "KUR");

        // Printing the employee details
        System.out.println("Name\tYear of Joining\tAddress");
        emp1.printDetails();
        emp2.printDetails();
    }
}

