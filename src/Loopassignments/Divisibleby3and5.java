package Loopassignments;

public class Divisibleby3and5 {
    public static void main(String[] args) {
        int i;
        System.out.println("Divided by 3 : ");
        for (i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println(" " + i);
            }
        }
            System.out.println("Divided by 5 : ");
            for (i = 1; i <= 100; i++) {
                if (i % 5 == 0) {
                    System.out.println(" " + i);
                }
            }
            System.out.println("Divided by 3 and 5 : ");
            for (i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(" " + i);
                }
            }


    }
}
