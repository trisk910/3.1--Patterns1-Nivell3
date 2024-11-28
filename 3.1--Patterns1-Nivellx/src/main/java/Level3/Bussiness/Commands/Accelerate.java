package Level3.Bussiness.Commands;

import Level3.Bussiness.Interfaces.Command;
import Level3.Bussiness.Interfaces.Vehicle;

public class Accelerate implements Command {
    private Vehicle vehicle;

    public Accelerate(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
