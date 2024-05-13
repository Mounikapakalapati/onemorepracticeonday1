package Ifelseassignments;

import java.util.Scanner;

public class Numberofdaysinamonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a from 1 to 12 = ");
        int i = scan.nextInt();

        if (i == 1) {
            System.out.println("January having 31 days");
        } else if (i == 2) {
            System.out.println("February having 28 days");
        } else if (i == 3) {
            System.out.println("March having 31 days");
        } else if (i == 4) {
            System.out.println("April having 30 days");
        } else if (i == 5) {
            System.out.println("May having 31 days");
        } else if (i == 6) {
            System.out.println("June having 30 days");
        } else if (i == 7) {
            System.out.println("July having 31 days");
        } else if (i == 8) {
            System.out.println("August having 31 days");
        } else if (i == 9) {
            System.out.println("September having 30 days");
        } else if (i == 10) {
            System.out.println("October having 31 days");
        } else if (i == 11) {
            System.out.println("November having 30 days");
        } else if (i == 12) {
            System.out.println("December having 31 days");
        } else {
            System.out.println("You have entered wrong number");
        }


    }
}
