package patterns.strategy;

public class PassangerVehicle extends Vehicle{
    public PassangerVehicle() {
        super(new NormalDriveStrategy());
    }
}
