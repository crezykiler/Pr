import java.util.Scanner;

public class Pemilihan2Percobaan217 {
   
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        int pilihan_menu;
        String member, jenis_pembayaran;
        double harga, diskon = 0, total_bayar = 0, total_potongan, potongan = 0;

        System.out.println("-------------------------");
        System.out.println("===== Menu Kafe JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("---------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input17.nextInt();
        input17.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input17.nextLine();
        System.out.print("Ingin membayar secara (tunai/qris) ? = ");
        jenis_pembayaran = input17.nextLine();
        System.out.println("---------------------------------");    

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Buncing = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        }

        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Buncing = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }

        if (jenis_pembayaran.equalsIgnoreCase("qris")) {
            potongan = 1000;
            total_potongan = total_bayar - potongan;
            System.out.println("Total bayar dengan qris = " + total_potongan);
        } else if (jenis_pembayaran.equalsIgnoreCase("tunai")) {
            System.out.println("Total bayar dengan tunai = " + total_bayar);
        } else {
            System.out.println("Jenis pembayaran tidak valid");
        }

        System.out.println("---------------------------------");
    }
}
