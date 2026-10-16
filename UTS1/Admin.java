package UTS1;

public class Admin extends User {
    private int vehicleCounter = 0;

    public Admin(int userId, String password, String name,
                 int age, String emailId, String doc) {
        super(userId, password, name, age, emailId, doc);
    }

    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Detail kendaraan dengan ID " + vehicleId + " diperbarui");
    }

    public Vehicle addVehicle() {
        vehicleCounter++;
        Vehicle vehicle = new Vehicle(vehicleCounter, "Kendaraan " + vehicleCounter);
        System.out.println("Kendaraan baru ditambahkan: " + vehicle.getName()
                + " (ID " + vehicle.getVehicleId() + ")");
        return vehicle;
    }

    public void retrieveComplain() {
        System.out.println("Admin mengambil daftar komplain dari customer");
    }

    public void verifyUser(Customer customer) {
        customer.setVerificationStatus(true);
        System.out.println("Admin memverifikasi user: " + customer.getProfile().getName());
    }
}
