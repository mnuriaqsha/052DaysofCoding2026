import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angka = hi.nextInt();

        while (angka <= 20) {
            System.out.println(angka);
            angka += 2;
        }

    }
}
