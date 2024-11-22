import java.util.Scanner;
public class Percobaan617 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukan panjang: ");
        p = input.nextInt();
        System.out.println("Masukan lebar: ");
        l = input.nextInt();
        System.out.println("Masukan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l); 
        System.out.println("Luas Persegi panjang adalah: "+L);

        vol = hitungVolume(t, p, L);
        System.out.println("Volume balok adalah: " + vol);
    }
    // luas
    public static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    // volume
    public static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }


}
