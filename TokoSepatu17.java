import java.util.Scanner;;

public class TokoSepatu17 {

    public static void main(String[] args) {;
    Scanner input17 = new Scanner(System.in);

    String merk, kategori ;
    int ukuran, harga;

    System.out.println("Selamat datang di Toko Sepatu17.");
    System.out.print("Mau beli merk apa (converse/sketcher/nike) ? : ");
    merk = input17.nextLine();
    
    if (merk.equalsIgnoreCase("converse")) {
        System.out.print("pilih kategori apa (1. slip on / 2. high top) ? : ");
        kategori = input17.nextLine();
        if (kategori.equals("1")) {
            System.out.print("pilih ukuran berapa (36-40) ? : ");
            ukuran = input17.nextInt();
            if (ukuran == 36 ) {
                harga = 800000;
            System.out.println("Harga RP " + harga);
            } if (ukuran == 37 ) {
                harga = 800000;
            System.out.println("Harga RP " + harga);
            }
            if (ukuran == 38 ) {
                harga = 800000;
            System.out.println("Harga RP " + harga);
            }
            if (ukuran == 39 ) {
                harga = 800000;
            System.out.println("Harga RP " + harga);
            }
            if (ukuran == 40 ) {
                harga = 800000;
            System.out.println("Harga RP " + harga);
            }
            else {
                System.out.println("Masukan ukuran salah");
            }
        } else if (kategori.equals("2")) {
            System.out.print("pilih ukuran berapa (40-44) ? : ");
            ukuran = input17.nextInt();
            if (ukuran == 40 ) {
                harga = 1200000;
                System.out.println("Harga RP " + harga);
                } 
                if (ukuran == 41 ) {
                    harga = 1200000;
                System.out.println("Harga RP " + harga);
                }
                if (ukuran == 42 ) {
                    harga = 1200000;
                System.out.println("Harga RP " + harga);
                }
                if (ukuran == 43 ) {
                    harga = 1200000;
                System.out.println("Harga RP " + harga);
                }
                if (ukuran == 44 ) {
                    harga = 1200000;
                System.out.println("Harga RP " + harga);
                } else {
                    System.out.println("Masukan ukuran salah");
                }
        } else {
            System.out.println("Masukan Salah");
        }

    } else if (merk.equalsIgnoreCase("sketcher")) {
        System.out.print("pilih kategori apa (1. woman / 2. man) ? : ");
        kategori = input17.nextLine();
        if (kategori.equals("1")) {
            System.out.print("pilih ukuran berapa (36-41) ? : ");
            ukuran = input17.nextInt();
            if (ukuran == 36 ) {
                harga = 1000000;
            System.out.println("Harga RP " + harga);
            } 
            if (ukuran == 37 ) {
                harga = 1000000;
            System.out.println("Harga RP " + harga);
            }
            if (ukuran == 38 ) {
                harga = 1000000;
            System.out.println("Harga RP " + harga);
            }
            if (ukuran == 39 ) {
                harga = 1000000;
            System.out.println("Harga RP " + harga);
            }
            if (ukuran == 40 ) {
                harga = 1000000;
            System.out.println("Harga RP " + harga);
            }
            if (ukuran == 41 ) {
                harga = 1000000;
            System.out.println("Harga RP " + harga);
            }
            else {
                System.out.println("Masukan ukuran salah");
            }
        } else if (kategori.equals("2")) {
            System.out.print("pilih ukuran berapa (41-44) ? : ");
            ukuran = input17.nextInt();
            if (ukuran == 41 ) {
                harga = 1800000;
                System.out.println("Harga RP " + harga);
            }
            if (ukuran == 42) {
                harga = 1800000;
                System.out.println("Harga RP " + harga);
            } 
            if (ukuran == 43) {
                harga = 1800000;
                System.out.println("Harga RP " + harga);
            }
            if (ukuran == 44) {
                harga = 1800000;
                System.out.println("Harga RP " + harga);
            }
            else {
                    System.out.println("Masukan ukuran salah");
                }
        } else {
            System.out.println("Masukan Salah");
        }

    }else if (merk.equalsIgnoreCase("nike")) {
        System.out.print("pilih kategori apa (1. kid / 2. adult) ? : ");
        kategori = input17.nextLine();
        if (kategori.equals("1")) {
            System.out.print("pilih ukuran berapa (36-40) ? : ");
            ukuran = input17.nextInt();
            if (ukuran == 36 ) {
                harga = 750000;
            System.out.println("Harga RP " + harga);
            } 
            if (ukuran == 37) {
                harga = 750000;
            System.out.println("Harga RP " + harga);
            }
            if (ukuran == 38 ) {
                harga = 750000;
            System.out.println("Harga RP " + harga);
            }
            if (ukuran == 39 ) {
                harga = 750000;
            System.out.println("Harga RP " + harga);
            }
            if (ukuran == 40 ) {
                harga = 750000;
            System.out.println("Harga RP " + harga);
            }else {
                System.out.println("Masukan ukuran salah");
            }
        } else if (kategori.equals("2")) {
            System.out.print("pilih ukuran berapa (40-44) ? : ");
            ukuran = input17.nextInt();
            if (ukuran == 41) {
                harga = 1500000;
                System.out.println("Harga RP " + harga);
            }
            if (ukuran == 42) {
                harga = 1500000;
                System.out.println("Harga RP " + harga);
            }
            if (ukuran == 43) {
                harga = 1500000;
                System.out.println("Harga RP " + harga);
            }
            if (ukuran == 44) {
                harga = 1500000;
                System.out.println("Harga RP " + harga);
            }
            else {
                    System.out.println("Masukan ukuran salah");
                }
        } else {
            System.out.println("Masukan Salah");
        }

    } else{
        System.out.println("Masukan Salah");
    }
    input17.close();
}
}
