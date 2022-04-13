import java.util.Scanner;
public class Password {
    public static void main(String[] args){
    int password;
    boolean isPassword = false;

    Scanner input = new Scanner(System.in);

    while (!isPassword){
        System.out.print("sifre girin: ");
        password =input.nextInt();
        if (password == 123){
            System.out.println("basarili");
            isPassword = true;
        }else
            System.out.println("hatali");
    }
    }
}