package desgin.parkinglot.pojo;

import desgin.parkinglot.businessfuctions.HourlyPricingStrategy;
import desgin.parkinglot.businessfuctions.MinuteWisePricingStrategy;
import desgin.parkinglot.businessfuctions.PricingStrategy;

public class Vehicle {
    VehicleType type;
    String number;
    PricingStrategy pricingStrategy;

    public Vehicle(VehicleType type, String number) {
        this.type = type;
        this.number = number;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
