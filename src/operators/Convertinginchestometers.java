package operators;

import java.util.Scanner;

public class Convertinginchestometers {

    public static void main(String[] args) {
        double inch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter input in inches =");
        inch = scan.nextDouble();
        double meters = inch * 0.0254;
        System.out.println("Inches into meters for given number is " + meters);



    }
}
