import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int n1,n2,k=1,i=1,ebob=1,ekok=1;
        Scanner input = new Scanner(System.in);

        System.out.print("enter first number: ");
        n1 = input.nextInt();
        System.out.print("enter second number: ");
        n2 = input.nextInt();

        while(k<=n1){
            if (n1%k == 0 && n2%k == 0){
                ebob = k;
            }k++;
        }
        while(i<=(n1*n2)){
            if(i%n1==0 && i%n2==0){
                ekok = i;
                break;
            }i++;
        }System.out.println("Ebob: "+ ebob + "\nEkok: "+ ekok);
    }
}