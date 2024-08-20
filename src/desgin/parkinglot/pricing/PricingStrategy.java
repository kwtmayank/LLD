package desgin.parkinglot.businessfuctions;

import desgin.parkinglot.pojo.Ticket;

public class PricingStrategy {
    Ticket ticket;

    int getPrice() {
        return ticket.getParkingSpot().getPrice();
    }
}
