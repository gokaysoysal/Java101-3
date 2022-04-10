import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        double perKm = 2.20, distance, start = 10, minimum = 20, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        distance = input.nextDouble();

        total = (distance * perKm) + start;

        double min = (total <= minimum) ? minimum : total;

        System.out.print("Taxi Fare: " + min);



    }
}
