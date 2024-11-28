package Level3.Bussiness;

import Level3.Bussiness.Interfaces.Vehicle;

public class Bicycle implements Vehicle {
    public void start() {
        System.out.println("Bicycle started");
    }

    public void accelerate() {
        System.out.println("Bicycle accelerated");
    }

    public void brake() {
        System.out.println("Bicycle braked");
    }
}
