import java.util.Scanner;

public class Soallatihan {
    public static void main(String[] args){

         
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("====================================");
        System.out.println("      Penghitung Barang Belanja       ");
        System.out.println("====================================\n");
        
        
        System.out.print("Masukkan harga barang (Rp): ");
        double hargaAwal = scanner.nextDouble();
        
        
        System.out.print("Masukkan diskon (contoh: 20 untuk 20%): ");
        double persentaseDiskon = scanner.nextDouble();
        
        
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();
        
        
        double diskon = (persentaseDiskon / 100) * hargaAwal;
        double hargaSetelahDiskon = hargaAwal - diskon;
        
        
        double totalHarga = hargaSetelahDiskon * jumlahBarang;
        
        
        System.out.println("          Hasil Pembelian         ");
        System.out.println("====================================");
        System.out.printf("Harga barang     : Rp %.2f\n", hargaAwal);
        System.out.printf("Diskon                : Rp %.2f (%.2f%%)\n", diskon, persentaseDiskon);
        System.out.printf("Harga setelah diskon  : Rp %.2f\n", hargaSetelahDiskon);
        System.out.printf("Jumlah barang         : %d\n", jumlahBarang);
        System.out.println("------------------------------------");
        System.out.printf("Total harga setelah diskon: Rp %.2f\n", totalHarga);
        System.out.println("====================================\n");
        
        // Menutup Scanner
        scanner.close();
    }
    
}
