package backend;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestKoneksi {
    private static final String URL = "jdbc:postgresql://localhost:5432/db_gym";
    private static final String USER = "postgres";
    private static final String PASS = "postgres";

    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Koneksi BERHASIL!");
        } else {
            System.out.println("Koneksi GAGAL!");
        }
    }

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
            return null;
        }
    }
}
