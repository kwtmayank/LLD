package patterns.abstractfactory.vehiclefactory;

import patterns.abstractfactory.vehicle.Audi;
import patterns.abstractfactory.vehicle.Merc;
import patterns.abstractfactory.vehicle.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        return switch (type) {
            case "Merc" -> new Merc();
            case "Audi" -> new Audi();
            default -> null;
        };
    }
}
