import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {

        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Hangi ay dogdunuz: ");
        month = input.nextInt();
        System.out.print("Hangi gun dogdunuz: ");
        day = input.nextInt();

        switch (month){
            case 1 :
                if (day>=1 && day>=31){
                    if (day<22){
                        burc = "oglak";
                    }
                    else {
                        burc = "kova";
                    }
                }else {
                    isError = true;
                }break;
        }
    }
}