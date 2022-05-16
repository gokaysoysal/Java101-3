import java.util.Scanner;

public class DeseneGore {
    static int f(int n) {
        System.out.print(n);
        if (n <= 0) {
            return f(n + 5);

        }
        return f(n - 5);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int sayi = input.nextInt();
        f(sayi);
    }
}
