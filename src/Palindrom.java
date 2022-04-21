import  java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int number){
        int tempNumber,reverseNumber = 0,lastNumber;
        tempNumber = number;

        while (tempNumber!=0){
            lastNumber = tempNumber%10;

            reverseNumber = (reverseNumber * 10)+ lastNumber;

            tempNumber/=10;
        }
        return number==reverseNumber;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(828));
    }}