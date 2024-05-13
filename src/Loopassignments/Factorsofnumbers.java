package Loopassignments;

import java.util.Scanner;

public class Factorsofnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = scan.nextInt();
        int i;
        for(i=1;i<=number;i++){
            if (number%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
