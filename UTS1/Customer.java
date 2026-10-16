package UTS1;

public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(int userId, String password, String name,
            int age, String emailId, String doc) {
        super(userId, password, name, age, emailId, doc);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(boolean verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public void applyVerification(String doc) {
        String d = doc.toLowerCase();
        if (d.endsWith(".jpg") || d.endsWith(".png") || d.endsWith(".pdf")) {
            System.out.println(getProfile().getName()
                    + " mengajukan verifikasi dengan dokumen " + doc);
            System.out.println("Status: menunggu verifikasi admin");
        } else {
            System.out.println("Format dokumen tidak didukung (gunakan .jpg, .png, atau .pdf)");
        }
    }
}
