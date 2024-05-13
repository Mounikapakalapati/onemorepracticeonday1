package operators;

import java.util.Scanner;

public class Squarecube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value =");
        int i = scan.nextInt();
        int j=i*i;
        int k=i*i*i;
        int l=k*i;
        System.out.println("Square of the given value is ="+j);
        System.out.println("Cube of the given value is ="+k);
        System.out.println("Fourth power of the given value is ="+l);
    }
}
