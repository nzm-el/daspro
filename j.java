import java.util.Scanner;

public class j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan = "Andi";
        boolean isMember = true;
        String kodePromo = "DISKON50"; 
        Menu(namaPelanggan, isMember, kodePromo);

        int totalHarga = 0;
        boolean lanjut = true;
        while (true) {
            System.out.println("\nMasukan nomor menu yang ingin Anda");
            System.out.print("pesan (1-6) atau 0 untuk selesai : ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                lanjut = false; 
                continue; 
            }
            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Pilihan menu tidak valid! Silakan coba lagi.");
                continue; 
            }
            System.out.print("Masukan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            int hargaPesanan = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalHarga += hargaPesanan;
            
            System.out.println("Total harga untuk pesanan ini: Rp" + hargaPesanan);
            System.out.println("Total keseluruhan pesanan Anda: Rp" + totalHarga);
        }
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if ("DISKON50".equals(kodePromo)) {
            hargaTotal *= 0.5; 
        } else if ("DISKON30".equals(kodePromo)) {
            hargaTotal *= 0.7;
        } else if (kodePromo != null && !kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid! Tidak ada pengurangan total harga.");
        }
        return hargaTotal;
    }
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if ("DISKON50".equals(kodePromo)) {
            System.out.println("Anda mendapatkan diskon 50%!");
        } else if ("DISKON30".equals(kodePromo)) {
            System.out.println("Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid!");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
}