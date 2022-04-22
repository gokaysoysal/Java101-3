import java.util.Scanner;

public class OptionalCalculator {
    static int sum(int a, int b){
        int result = a+b;
        System.out.println();
        System.out.println("Sum: "+result);
        return result;
    }
    static int sub(int a, int b){
        int result = a-b;
        System.out.println();
        System.out.println("Subtraction: "+result);
        return result;
    }
    static int times(int a, int b){
        int result = a*b;
        System.out.println();
        System.out.println("Multiplication: " + result);
        return result;
    }
    static int div(int a, int b){
        int result = a/b;
        System.out.println();
        System.out.println("Division: "+ result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i=1; i<=b ;i++){
            result *=a;
        }
        System.out.println();
        System.out.println("Power: " + result);
        return result;
    }
    static int mod(int a, int b){
        int result = a%b;
        System.out.println();
        System.out.println("Mod: "+ result);
        return result;
    }
    static void cal(int a, int b){
        System.out.println();
        System.out.println("Area: "+ (a*b)+ "\nPerimeter: "+(2*(a+b)));
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select, a, b;
        String menu = "1)Sum\n"+
                "2)Subtraction\n"+
                "3)Multiplication\n"+
                "4)Division\n"+
                "5)Power\n"+
                "6)Mod\n"+
                "7)Rectangle Calculation\n"+
                "8)Exit";

        System.out.println(menu);
        while (true){
            System.out.println("=============================");
            System.out.print("Select Operation: ");
            select = input.nextInt();

            if (select ==8){
                System.out.print("Good Bye!");
                break;
            }
            System.out.print("Enter first number: ");
            a= input.nextInt();
            System.out.print("Enter second number: ");
            b= input.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    sub(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    div(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    cal(a,b);
                    break;
                default:
                    System.out.print("Incorrect operation!");
            }
        }
    }
}