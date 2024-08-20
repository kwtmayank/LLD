package desgin.parkinglot.pojo;

import desgin.parkinglot.businessfuctions.PricingStrategy;

public class Ticket {
    long entryTime;
    int ticketId;
    ParkingSpot parkingSpot;
    Vehicle vehicle;

    PricingStrategy pricingStrategy;

    public Ticket(long entryTime, ParkingSpot parkingSpot, Vehicle vehicle, PricingStrategy pricingStrategy) {
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.pricingStrategy = pricingStrategy;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Ticket(long entryTime, int ticketId, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.ticketId = ticketId;
        this.parkingSpot = parkingSpot;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
