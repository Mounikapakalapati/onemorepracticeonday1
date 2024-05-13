package Loopassignments;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some digits = ");
        long l1 = scan.nextLong();

        long reverse =0;
        long reminder;

        while (l1!=0)
        {

            reminder = l1%10;
            reverse = reverse * 10 + reminder;
            l1=l1/10;

        }
        System.out.println("Reverse number is = "+reverse);
    }
}
