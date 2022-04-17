import  java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        int i;
        int total=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            i = input.nextInt();
            if (i%2==1){
                total += i;
            }
        }while (i>0);
        System.out.print("Total: " + total);
    }

}