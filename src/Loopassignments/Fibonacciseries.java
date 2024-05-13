package Loopassignments;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter count value = ");
        int count = scan.nextInt();
        int i;
        int num1=0;
        int num2=1;
        int num3;

        for(i=0;i<count;i++)
        {

            num3=(num1+num2);
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;


        }

    }
}
