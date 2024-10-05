import java.util.Scanner;

public class TokoBuku17 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        String jenis_buku, hari;
        int jml_buku;
        double jml_harga, ttl_diskon = 0, diskon = 0;
        int harga_jenis_buku;

        System.out.println("====-------------------------------------------------====");
        System.out.println("Selamat datang di Toko Buku.");
        System.out.print("Ingin membeli buku seperti apa (kamus, novel, buku) ? : ");
        jenis_buku = input17.nextLine();
        System.out.print("Berapa jumlah buku? : ");
        jml_buku = input17.nextInt();
        input17.nextLine();  
        System.out.print("Apakah sekarang hari rabu (y/n) ? ");
        hari = input17.nextLine();

        boolean hariRabu = hari.equalsIgnoreCase("y");

       
        if (!hariRabu) {
            System.out.println("Tidak ada diskon karena bukan hari Rabu.");
            diskon = 0;  
        }

        if (jenis_buku.equalsIgnoreCase("kamus")) {
            harga_jenis_buku = 12000;
            System.out.println("Harga Kamus: " + harga_jenis_buku);

            if (hariRabu) { 
                diskon = 0.10;
                System.out.println("Mendapat diskon 10%");
                if (jml_buku > 2) {
                    diskon += 0.02;
                    System.out.println("Mendapat tambahan diskon 2% karena membeli lebih dari 2 buku.");
                }
            }

            ttl_diskon = (harga_jenis_buku * jml_buku) * diskon;
            jml_harga = harga_jenis_buku * jml_buku - ttl_diskon;

            System.out.println("Total diskon: " + ttl_diskon);
            System.out.println("Total bayar setelah diskon: " + jml_harga);

        } else if (jenis_buku.equalsIgnoreCase("novel")) {
            harga_jenis_buku = 10000;
            System.out.println("Harga Novel: " + harga_jenis_buku);

            if (hariRabu) {  
                diskon = 0.07;
                System.out.println("Mendapat diskon 7%");
                if (jml_buku > 3) {
                    diskon += 0.02;
                    System.out.println("Mendapat tambahan diskon 2% karena membeli lebih dari 3 novel.");
                }
            }

            ttl_diskon = (harga_jenis_buku * jml_buku) * diskon;
            jml_harga = harga_jenis_buku * jml_buku - ttl_diskon;

            System.out.println("Total diskon: " + ttl_diskon);
            System.out.println("Total bayar setelah diskon: " + jml_harga);

        } else if (jenis_buku.equalsIgnoreCase("buku")) {
            harga_jenis_buku = 8000;
            System.out.println("Harga Buku: " + harga_jenis_buku);

            if (hariRabu && jml_buku > 3) {  
                diskon = 0.05;
                System.out.println("Mendapat diskon 5% karena membeli lebih dari 3 buku.");
            }

            ttl_diskon = (harga_jenis_buku * jml_buku) * diskon;
            jml_harga = harga_jenis_buku * jml_buku - ttl_diskon;

            System.out.println("Total diskon: " + ttl_diskon);
            System.out.println("Total bayar setelah diskon: " + jml_harga);

        } else {
            System.out.println("Masukan anda salah.");
        }

        input17.close();  
    }
}
