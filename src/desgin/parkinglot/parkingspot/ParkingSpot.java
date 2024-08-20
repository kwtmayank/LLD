package desgin.parkinglot.pojo;

public class ParkingSpot {

    boolean isVacant;
    int price;
    int id;

    Vehicle vehicle;

    public ParkingSpot(int id, boolean isVacant, int price) {
        this.isVacant = isVacant;
        this.price = price;
        this.id = id;
    }

    public boolean isVacant() {
        return isVacant;
    }

    public void setVacant(boolean vacant) {
        isVacant = vacant;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
