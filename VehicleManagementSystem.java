import java.util.*;

interface Maintained {
    void scheduleMaintenance();
    boolean isMaintenanceDue();
}

class Vehicle implements Maintained {
    protected String make, model;
    protected double rentalRate;
    protected boolean isAvailable = true;
    protected boolean maintenanceDue = false;

    public Vehicle(String make, String model, double rentalRate) {
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateRentalCost(int days) {
        return days * rentalRate;
    }

    public void rentVehicle() throws Exception {
        if (!isAvailable) {
            throw new Exception("Vehicle is not available for rent.");
        }
        isAvailable = false;
    }

    public void returnVehicle() {
        isAvailable = true;
    }

    public void scheduleMaintenance() {
        maintenanceDue = true;
    }

    public boolean isMaintenanceDue() {
        return maintenanceDue;
    }
}

class Car extends Vehicle {
    public Car(String make, String model, double rentalRate) {
        super(make, model, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * rentalRate * 1.1; // Additional cost for premium features
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, double rentalRate) {
        super(make, model, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * rentalRate * 1.2; // Higher rate for trucks
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, double rentalRate) {
        super(make, model, rentalRate);
    }
}

public class VehicleManagementSystem {
    private static List<Vehicle> fleet = new ArrayList<>();

    public static void main(String[] args) {
        fleet.add(new Car("Toyota", "Corolla", 50));
        fleet.add(new Truck("Ford", "F-150", 80));
        fleet.add(new Motorcycle("Honda", "CBR", 30));

        try {
            fleet.get(0).rentVehicle();
            System.out.println("Rental Cost: $" + fleet.get(0).calculateRentalCost(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
