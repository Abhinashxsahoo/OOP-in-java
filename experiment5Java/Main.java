class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    public Car(String model, int year, int numDoors, String fuelType) {
        super(model, year); 
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Camry", 2024, 5, "Petrol");
        myCar.displayInfo();
    }
}
