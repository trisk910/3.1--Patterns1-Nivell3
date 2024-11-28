package Level3.Bussiness;

import Level3.Bussiness.Interfaces.Vehicle;

public class Boat implements Vehicle {
    @Override
    public void start() {
        System.out.println("Boat starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Boat accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Boat braking");
    }
}
