class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model;
    int doors;
    String ownerName;
    double fuelCapacity;
    String color;       // New attribute
    boolean isElectric; // New attribute

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Owner: " + ownerName);
        System.out.println("Doors: " + doors);
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Color: " + color);
        System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Tesla";
        myCar.model = "Model S";
        myCar.ownerName = "Angel Fhey Cataros";
        myCar.doors = 4;
        myCar.fuelCapacity = 100;  // Battery equivalent in kWh
        myCar.color = "White";
        myCar.isElectric = true;

        myCar.start();
        myCar.displayInfo();
    }
}
