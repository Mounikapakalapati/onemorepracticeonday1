package operators;
import java.util.*;
public class Acceptingtwointegers {
    public static void main(String[] args) {
        int i;
        int j;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter i value =");
        i = scan.nextInt();
        System.out.print("Enter j value =");
        j = scan.nextInt();

        double avg = (i + j)/2.0;

        System.out.println("Sum of two digits = " + (i + j));
        System.out.println("Difference of two digits = " + (i - j));
        System.out.println("Product of two digits = " + (i * j));
        System.out.println("Average of two digits = " + avg);
        System.out.println("Distance of two digits = " + (i - j));

        if (i > j) {
            System.out.println("Maximum number is =" + i);
            System.out.println("Minumum number is =" + j);
        }
        if(j > i){
            System.out.println("Maximum number is =" +j);
            System.out.println("Minumum number is =" + i);
        }

    }
}
