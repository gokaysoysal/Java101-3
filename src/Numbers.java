import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        int i,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi girin: ");
        k = input.nextInt();

        for (i = 1; i < k; i *= 2) {
            System.out.println(i);

        }

    }
}
