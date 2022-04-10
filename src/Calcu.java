import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        n1 = input.nextInt();
        System.out.print("Please enter second number: ");
        n2 = input.nextInt();
        System.out.println("Please select operations: \n1)addition\n2)substraction\n3)multiplication\n4)division");
        select = input.nextInt();

        if (select == 1){
            System.out.println("Additional" + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Substraction: " + (n1 - n2));
        }else  if (select == 3) {
            System.out.println("Multipliction: " + (n1 * n2));
        } else if (select == 4) {
            System.out.println("Division: " + (n1 / n2));
        } else
            System.out.println("Something goes wrong. Please try again.");
    }
}
