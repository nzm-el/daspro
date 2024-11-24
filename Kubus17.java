import java.util.Scanner;
public class Kubus17 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Sisi Kubus: ");
        double sisi = sc.nextDouble();

        System.out.println("Volume Kubus: " + hitungVolume(sisi));
        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
    }
    
    static double hitungVolume(double sisi) {
        double volume = sisi * sisi * sisi;
        return volume;
    }

    static double hitungLuasPermukaan(double sisi) {
        double luasPermuk = sisi * sisi * 6;
        return luasPermuk;
    }






}
