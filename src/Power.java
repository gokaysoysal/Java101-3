import  java.util.Scanner;

public class Power {

    static int power(int a, int b){
        int result = 1;
        for (int i =1;i <=b;i++){
            result*=a;
        }
        System.out.println("Power: "+ result);
        return result;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;


        while(true){
            System.out.println("===============");
            System.out.print("Enter first number: ");
            a = input.nextInt();
            System.out.print("Enter second number: ");
            b= input.nextInt();
        power(a,b);
        }

    }
}
