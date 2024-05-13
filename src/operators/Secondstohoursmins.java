package operators;

import java.util.Scanner;

public class Secondstohoursmins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of seconds = ");
        long l1 = scan.nextLong();
        long hours = (l1/3600);
        long minutes =((l1%3600)/60);
        long seconds = (l1%60);

        System.out.println(hours +" Hours "+minutes+" Minutes "+seconds+" Seconds ");
    }
}
