package operators;

import java.util.Scanner;

public class Convertingmintoyearsandays {

    public static void main(String[] args) {
        long minutes;
        long minsPerDAY =  60 * 24;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter input in minutes =");
        minutes = scan.nextLong();

        long days = (minutes / minsPerDAY);
        int years = (int) (days / 365);

        System.out.println("minutes into years for given number is " + years);
        System.out.println("minutes into days for given number is " + days);
    }
}
