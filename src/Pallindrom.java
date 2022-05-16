import java.util.Scanner;

public class Pallindrom {
    static boolean isPallindrom(int number) {
        int temp = number, reverse = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverse = (reverse * 10) + lastNumber;
            temp /= 10;
        }
        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number: ");
        int a = input.nextInt();
        System.out.print(isPallindrom(a));
    }
}
