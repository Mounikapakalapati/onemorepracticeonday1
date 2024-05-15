package Ifelseassignments;

import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter one number = ");
        int i = scan.nextInt();
        int actualnumber=i;
        int remainder;
        int sum=0;

        while(i!=0){

            remainder = (i%10);
            sum = sum+ (remainder*remainder*remainder);
            i=i/10;
        }
        System.out.println(sum);
        if(sum==actualnumber){
            System.out.println("Given number is Armstrong number");
        }
        else{
            System.out.println("Given number is not Armstrong number");
        }

    }

}
