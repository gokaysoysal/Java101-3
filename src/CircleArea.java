import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        double  r, pi = 3.14, area, circumference;

        Scanner input = new Scanner(System.in);



        System.out.print("Enter 'r': ");
        r = input.nextDouble();

        area = r*r*pi;
        circumference = 2*pi*r;

        System.out.println("Area is: " + area);
        System.out.println("Circumference is: " + circumference);
    }
}
