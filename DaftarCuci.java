import java.util.*;

public class DaftarCuci {
    List<Cucian> daftar = new ArrayList<>();

    public void terimaCucian(int idCuci, String namaPelanggan, int tanggalMasuk, String tipeCucian) {
        daftar.add(new Cucian(idCuci, namaPelanggan, tanggalMasuk, tipeCucian));
    }

public void tampilkanUrutanCucian() {
    daftar.sort(Comparator
        .comparingInt(Cucian::getTanggalSelesai)
        .thenComparingInt(c -> getPrioritasTipe(c.tipeCucian))
        .thenComparingInt(c -> c.tanggalMasuk)
        .thenComparingInt(c -> c.idCuci)
    );
    System.out.println("Urutan cucian harus diselesaikan:");
    for (Cucian c : daftar) {
        System.out.println("idCuci = " + c.idCuci + ", namaPelanggan = " + c.namaPelanggan);
    }
}

    private int getPrioritasTipe(String tipe) {
        switch (tipe.toLowerCase()) {
            case "kilat": return 1;
            case "express": return 2;
            case "biasa": return 3;
            default: return 99;
        }
    }
}