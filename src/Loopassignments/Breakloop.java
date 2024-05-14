package Loopassignments;

import java.util.Scanner;

public class Breakloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one integer number =");
        int i = scan.nextInt();

        while (true){
            System.out.println(i);
            if (i<0){
                break;
            }
        }

    }
}
