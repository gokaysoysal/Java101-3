import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int number = input.nextInt();

        int tempNumber = number;
        int basNumber=0;
        int basValue = 1;
        int basPow;
        int result=0;

        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;

        }tempNumber=number;
        while(tempNumber != 0){
            basValue = tempNumber %10;
            basPow =1;
            for (int i =1; i<=basNumber;i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /=10;


        }tempNumber=number;
        if (result==number){
            System.out.print(number + " bir armstrong sayidir.");

        }else {
            System.out.print(number + " bir armstrong sayi degildir.");
        }
    }
}
