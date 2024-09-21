import java.util.Scanner;

public class DeretAritmatika {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Batas awal: ");
        int batasAwal = s.nextInt();
        System.out.print("Masukkan Batas akhir: ");
        int batasAkhir = s.nextInt();
        System.out.print("Masukkan Kelipatan: ");
        int kelipatan = s.nextInt();

        System.out.println("Deret Aritmatika: ");
        for (int i = batasAwal; i <= batasAkhir; i += kelipatan) {
        }
        System.out.println();

        int j = batasAwal;
        while (j <= batasAkhir) {
            System.out.print(j + ", ");
            j += kelipatan;
        }
        System.out.println();

        s.close();
    }
}
