import  java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi girin: ");
        k = input.nextInt();

        for (int i=1; i<=k;i++){
            if (i%2 ==1){
                System.out.println(i);
            }
        }

    }
}