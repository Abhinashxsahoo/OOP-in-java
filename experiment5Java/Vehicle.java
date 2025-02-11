
class Vehicle {
    protected String model;
    protected int year;


    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

