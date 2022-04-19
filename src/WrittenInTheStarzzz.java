import java.util.Scanner;

public class WrittenInTheStarzzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir basamak sayisi girin: ");
        int n = input.nextInt();

        for (int i = 1; i<=n; i++){
            for (int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }

            for (int j=1; j<=(i*2)-1 ;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
