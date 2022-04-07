import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        double kdv = 0.18, fiyat, tutar, vergi;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyati giriniz: ");
        fiyat = input.nextDouble();

        vergi = fiyat * kdv;

        tutar = (fiyat * kdv) + fiyat;

        System.out.println("Fiyat: " + fiyat);
        System.out.println("KDV Orani: " + kdv);
        System.out.println("KDV Tutari: " + vergi);
        System.out.print("Vergiler Dahil Tutar: " + tutar);

    }
}
