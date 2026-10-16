package UTS1;

public class UserMain {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "cust123", "Budi", 20,"budi@mail.com", "ktp_budi.jpg");
        Admin admin = new Admin(1, "admin123", "Sari", 30,"sari@mail.com", "ktp_sari.pdf");

        judul("CUSTOMER");
        customer.logIn(101, "cust123");
        customer.getProfile().showDocuments();
        System.out.println("Status verifikasi : " + statusText(customer));
        customer.applyVerification("ktp_budi.jpg");
        customer.logOut();

        System.out.println();
        judul("ADMIN");
        admin.logIn(1, "admin123");
        admin.retrieveComplain();
        admin.verifyUser(customer);
        Vehicle v = admin.addVehicle();
        admin.updateVehicleDetails(v.getVehicleId());
        admin.logOut();

        System.out.println();
        judul("HASIL AKHIR");
        System.out.println("Status verifikasi Budi : " + statusText(customer));
    }

    private static void judul(String teks) {
        System.out.println("======================");
        System.out.println("  " + teks);
        System.out.println("======================");
    }

    private static String statusText(Customer c) {
        return c.getVerificationStatus() ? "Sudah terverifikasi" : "Belum terverifikasi";
    }
}
