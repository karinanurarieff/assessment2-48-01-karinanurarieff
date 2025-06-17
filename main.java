public class main {
    public static void main(String[] args) {
        DaftarCuci daftarCuci = new DaftarCuci();
        daftarCuci.terimaCucian(1, "Yuli", 5, "express", "Jl. Ciganitri no. 15");
        daftarCuci.terimaCucian(2, "Kiki", 6, "kilat", "Jl. Pogor no. 11");
        daftarCuci.terimaCucian(3, "Toto", 7, "biasa", "Jl. Sukabirus no. 15");
        daftarCuci.terimaCucian(4, "Juni", 8, "express","Jl Telekomunikasi no. 2");
        daftarCuci.terimaCucian(5, "Julia", 8, "Same day", "Jl. Ciganitri no. 13");
        daftarCuci.terimaCucian(6, "Agus", 9, "biasa", "Jl. Ciganitri no. 23");

        daftarCuci.tampilkanUrutanCucian();
    }
}
