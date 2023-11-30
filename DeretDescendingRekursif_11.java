import java.util.Scanner;

public class DeretDescendingRekursif_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        System.out.print("fungsi rekursif: ");
        deretRekursif(n);

        System.out.print("\nfungsi iteratif: ");
        deretIteratif(n);
    }

    static void deretRekursif(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            deretRekursif(n - 1);
        }
    }

    static void deretIteratif(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

}
