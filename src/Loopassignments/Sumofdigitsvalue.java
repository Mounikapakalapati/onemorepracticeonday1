package Loopassignments;

import java.util.Scanner;

public class Sumofdigitsvalue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some digits = ");
        int i = scan.nextInt();
        int sum=0;

        while(i!=0){

            sum += i%10;
            i=i/10;

        }
        System.out.println("Sum of given digits is = "+sum);
    }
}
