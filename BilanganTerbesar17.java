import java.util.Scanner;

public class BilanganTerbesar17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

      
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = input17.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        int bil2 = input17.nextInt();
        System.out.print("Masukkan bilangan ketiga : ");
        int bil3 = input17.nextInt();

        int terbesar = bil1;

        if (bil2 > terbesar) {
            terbesar = bil2;
        }

        if (bil3 > terbesar) {
            terbesar = bil3;
        }

        System.out.println("Bilangan terbesar: " + terbesar);
    }
}
