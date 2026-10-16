package UTS1;

public class Vehicle {
    private int vehicleId;
    private String name;

    public Vehicle(int vehicleId, String name) {
        this.vehicleId = vehicleId;
        this.name = name;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getName() {
        return name;
    }
}
