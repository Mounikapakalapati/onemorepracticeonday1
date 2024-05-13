package Ifelseassignments;

import java.util.Scanner;

public class Positiveornegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value = ");
        int i = scan.nextInt();
        if(i<0) {
            System.out.println("Given value is Negative ");
        }
            else
            System.out.println("Given value is Positive");



    }
}
