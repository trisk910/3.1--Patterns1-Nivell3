package Level3.Bussiness.Commands;

import Level3.Bussiness.Interfaces.Command;
import Level3.Bussiness.Interfaces.Vehicle;

public class StartCommand implements Command {
    private Vehicle vehicle;

    public StartCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}

