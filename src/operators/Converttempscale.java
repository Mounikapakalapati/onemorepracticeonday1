package operators;

import java.util.Scanner;

public class Converttempscale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter celsius temperature =");
        double celsius = scan.nextDouble();
        double fahrenheit = (1.8 * celsius + 32);
        System.out.println(celsius+ " Celsius = "+fahrenheit +" Fahrenheit");
        double kelvin = (celsius+273);
        System.out.println(celsius+ " Celsius = "+kelvin +" Kelvin");

    }
}
