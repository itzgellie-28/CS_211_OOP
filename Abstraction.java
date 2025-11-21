class Vehicle {

    void info() {
        System.out.println("This is a Vehicle");
    }

    void info(String brand) {
        System.out.println("Brand: " + brand);
    }

    void info(String brand, int year) {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
    
    void type(String model){
        System.out.println("Model: " + model);
    }
    
    void color(String color){
        System.out.println("Color: " + color);
    }

    void speed() {
        System.out.println("Vehicle has an average speed.");
    }
}

class Truck extends Vehicle {
    @Override
    void speed() {
        System.out.println("Truck runs at 90 km/h.");
    }
}

class Bike extends Vehicle {
    @Override
    void speed() {
        System.out.println("Bike runs at 100 km/h.");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v;

        v = new Truck();
        v.info();
        v.info("Ford");
        v.info("Ford", 2022);
        v.type("Heavy Duty");
        v.color("Black");
        v.speed();

        System.out.println();

        v = new Bike();
        v.info();
        v.info("Yamaha");
        v.info("Yamaha", 2023);
        v.type("Racing");
        v.color("Green");
        v.speed();
        
    }
}
