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

        System.out.println("Sum of two digits = " + (i + j));
        System.out.println("Difference of two digits = " + (i - j));
        System.out.println("Product of two digits = " + (i * j));
        System.out.println("Average of two digits = " + i / j);
        System.out.println("Distance of two digits = " + (i - j));

        if (i > j){
            System.out.println("Maximum number is =" + i);
    }
        if(i < j){
            System.out.println("Minimum number is =" +j);
        }

    }
}
