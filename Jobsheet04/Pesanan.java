import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private String tanggal;
    private String status;
    private double total;
    private Pelanggan pelanggan;
    private ArrayList<DetailPesanan> detailPesanan;

    public Pesanan(String idPesanan, String tanggal, Pelanggan pelanggan) {
        this.idPesanan = idPesanan;
        this.tanggal = tanggal;
        this.pelanggan = pelanggan;
        this.status = "Diproses";
        this.total = 0;
        this.detailPesanan = new ArrayList<>();
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void tambahDetail(ProdukSkincare produk, int jumlah) {
        if (produk.cekStok(jumlah)) {
            DetailPesanan detail = new DetailPesanan(produk, jumlah);
            detailPesanan.add(detail);
            produk.kurangiStok(jumlah);
            hitungTotal();
        } else {
            System.out.println("Stok produk " + produk.getNamaProduk() + " tidak mencukupi.");
        }
    }

    public void hitungTotal() {
        total = 0;

        for (DetailPesanan detail : detailPesanan) {
            total += detail.getSubtotal();
        }
    }

    public void ubahStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        String info = "";

        info += "ID Pesanan : " + idPesanan + "\n";
        info += "Tanggal    : " + tanggal + "\n";
        info += "Pelanggan  : " + pelanggan.getNama() + "\n";
        info += "Status     : " + status + "\n";
        info += "Detail Pesanan:\n";

        for (DetailPesanan detail : detailPesanan) {
            info += "  - " + detail.getInfo() + "\n";
        }

        info += "Total      : Rp" + total + "\n";

        return info;
    }
}