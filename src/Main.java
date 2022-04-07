import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenleri oluşturduk

        int mat, fizik, kimya, turkce, tarih, muzik;
        // zorunlu
        Scanner input = new Scanner(System.in);

        // kullanıcıdan değer alma bölümü
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double  sonuc = toplam /6;

        int xy = 60;


        System.out.println("Not Ortalamaniz: " + sonuc);

        String str = sonuc >= xy ? "Gectiniz" : "Kaldiniz";

        System.out.println(str);
    }}