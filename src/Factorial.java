import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter factorial number: ");
        int i = input.nextInt();
        int total =1;

        for (int k=1;k<=i;k++){
            total = total * k;
        }
        System.out.println(i + ". Factorial: " + total);
    }
}
