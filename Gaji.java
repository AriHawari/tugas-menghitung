import java.util.Scanner;

public class Gaji {
     public static void main(String[] args) throws InterruptedException {
        
        // start
        System.out.println("===================");
        System.out.println("Penghitung Gaji");
        System.out.println("===================");

        // input tarif per jam

        System.out.println("Masukkan nilai tarif per jam. (Masukkan angka)");
        int tarif = new Scanner(System.in).nextInt();

        // input jam

        System.out.println("Masukkan jumlah jam kerja. (Masukkan angka)");
        int jam = new Scanner(System.in).nextInt();

        // equation

        float gaji = (tarif * jam) - ((tarif * jam) * 10 / 100);

        // output

        System.out.println("Tunggu hasil dari nilai yang telah masukkan.");
        Thread.sleep(5000);
        System.out.println("Gaji anda adalah Rp" + gaji + ".");
        System.out.println("========================================");
        

    }
}

