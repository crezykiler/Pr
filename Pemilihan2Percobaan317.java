import java.util.Scanner;

public class Pemilihan2Percobaan317 {

    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        String kategori;
        int penghasilan, gaji_bersih;
        double pajak = 0;

        System.out.print("Masukkan kategori : ");
        kategori = input17.nextLine();
        System.out.print("Masukkan besarnya penghasilan : ");
        penghasilan = input17.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000)
            pajak = 0.1;
            else if (penghasilan <= 3000000)
            pajak = 0.15;
            else 
            pajak = 0.2;
            gaji_bersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan bersih : " + gaji_bersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000)
            pajak = 0.15;
            else if (penghasilan <= 3500000)
            pajak = 0.2;
            else 
            pajak = 0.25;
            gaji_bersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan bersih : " + gaji_bersih);
        } else
        System.out.println("Masukan kategori Salah");

    }
}