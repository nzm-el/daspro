/**
 * PengunjungCafe17
 */
public class PengunjungCafe17 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", 25, "Budi", 30, "Citra", 22);
    }

    public static void daftarPengunjung(Object... data) {
        System.out.println("Daftar Nama Pengunjung dan Usia : ");
        for (int i = 0; i < data.length; i += 2) {
            String nama = (String) data[i];
            Integer usia = (Integer) data[i + 1];
            System.out.println("- Nama: " + nama + ", Usia: " + usia);
        }
    }
}