package StringAssignments;

import java.util.Scanner;

public class EndStringPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First String = ");
        String input1 = scan.nextLine();
        System.out.println("Enter Second String = ");
        String input2 = scan.nextLine();
        boolean output = checkEnd(input1,input2);
        System.out.println(output);


    }
    public static boolean checkEnd(String x , String y){

         if(x.length() > y.length()){

             return false;

         }

         String endOfY = y.substring(y.length()-x.length());
         return x.equalsIgnoreCase(endOfY);

    }

}
