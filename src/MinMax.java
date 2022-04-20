import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quan,min=0,max=0,k=1;

        System.out.print("Enter quantity: ");
        quan = input.nextInt();

        while(k<=quan){
            if(quan>1){
                System.out.print("Enter "+ k+". number: ");
                int set = input.nextInt();
                if (set>min && set>max) {
                    max = set;
                    if (min == 0) {
                        min = set;

                    }
                }if (set<min && set<max){
                    min = set;
                    if (max ==0){
                        max =set;
                    }
                }
            }else {
                System.out.print("Error!");
            }k++;
        }System.out.print("Max: "+ max+ "\nMin: " + min);

    }
}
