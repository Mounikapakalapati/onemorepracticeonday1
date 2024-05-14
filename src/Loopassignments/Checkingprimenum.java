package Loopassignments;

import java.util.Scanner;

public class Checkingprimenum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = scan.nextInt();
        int temp=0;
        int i;

        for (i=2;i<=num/2;i++){

            if (num%i==0) {
                temp++;
                break;
            }


        }
        if (temp==0 && num!=0){
            System.out.println("Given number is prime number");
        }else
            System.out.println("Given number not prime number");


    }
}
