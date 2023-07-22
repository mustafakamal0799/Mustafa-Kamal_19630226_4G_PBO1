package latihanuas;

import java.util.Scanner;

public class TokoPrintBeraksi {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan Jumlah Pelanggan : ");
            int jumlahTransaksi = scanner.nextInt();

            TokoPrint[] transaksi = new TokoPrint[jumlahTransaksi];


            for (int i = 0; i < jumlahTransaksi; i++) {
                System.out.println("==============================");
                System.out.println("TOKO TAKA");
                System.out.println("==============================");
                System.out.println("Pelanggan ke-" + (i + 1) + ":");

                System.out.print("Masukkan Jumlah Halaman Warna : ");
                int printwarna = scanner.nextInt();

                System.out.print("Masukkan Jumlah Halaman Hitam Putih : ");
                int printhitamputih = scanner.nextInt();

                System.out.print("Apakah pelanggan member? (1 ya, 0 tidak) : ");
                int isPremium = scanner.nextInt();

                if (isPremium == 1) {
                    transaksi[i] = new TokoPrintPremium(printwarna, printhitamputih, jumlahTransaksi);
                } else {
                    transaksi[i] = new TokoPrint(printwarna, printhitamputih, jumlahTransaksi);
                }

                System.out.println("Jumlah Harga : " + transaksi[i].totalHarga());

                System.out.println("\n==========================================");

                System.out.print("Masukan jumlah uang yang diberikan : ");
                int uangDiberikan = scanner.nextInt();

                double kembalian = uangDiberikan - transaksi[i].totalHarga();

                System.out.println("Uang Kembalian : " + kembalian);
            }
        }catch (Exception e){
            System.out.println("Error : "+ e.getMessage());
        }      
    }
    
}
