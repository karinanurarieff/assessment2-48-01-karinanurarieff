public class Cucian {
    int idCuci;
    String namaPelanggan;
    int tanggalMasuk;
    String tipeCucian;
    int lamaPengerjaan;

    public Cucian(int idCuci, String namaPelanggan, int tanggalMasuk, String tipeCucian) {
        this.idCuci = idCuci;
        this.namaPelanggan = namaPelanggan;
        this.tanggalMasuk = tanggalMasuk;
        this.tipeCucian = tipeCucian;
        this.lamaPengerjaan = getLamaPengerjaan(tipeCucian);
    }

    private int getLamaPengerjaan(String tipe) {
        switch (tipe.toLowerCase()) {
            case "kilat": return 1;
            case "express": return 2;
            case "biasa": return 3;
            default: return 99;
        }
    }

    public int getTanggalSelesai() {
        return tanggalMasuk + lamaPengerjaan;
    }
}
