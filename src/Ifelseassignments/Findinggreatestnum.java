package Ifelseassignments;

import java.util.Scanner;

public class Findinggreatestnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First number = ");
        int i1 = scan.nextInt();
        System.out.print("Enter second number = ");
        int i2 = scan.nextInt();
        System.out.print("Enter Third number = ");
        int i3 = scan.nextInt();

        if (i1>i2&&i1>i3)
        {
            System.out.println("The greatest number is "+i1);
        }
        else if (i2>i1&&i2>i3)
        {
            System.out.println("The greatest number is " + i2);
        } else if (i3>i1&&i3>i2)
        {
            System.out.println("The greatest number is "+i3);
        }

    }
}

