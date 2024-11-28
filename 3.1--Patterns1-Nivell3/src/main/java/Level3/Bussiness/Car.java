package Level3.Bussiness;

import Level3.Bussiness.Interfaces.Vehicle;

public class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting");
    }

    public void accelerate() {
        System.out.println("Car accelerating");
    }

    public void brake() {
        System.out.println("Car braking");
    }
}
