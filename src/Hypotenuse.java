import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        float a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("Fist side lenght: ");
        a = input.nextFloat();

        System.out.print("Second side lenght: ");
        b = input.nextFloat();

        c = Math.sqrt((a*a) + (b*b));

        System.out.print("Hypotenuse: " + c);
   }
}
