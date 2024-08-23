package StringAssignments;

import java.util.Scanner;

public class AbcChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one string = ");
        String input = scan.nextLine();

        boolean output = abcChecker(input);
        System.out.println(output);

    }
    public static boolean abcChecker(String string){

       if (string.isEmpty()){
           return true;
       }
       if (string.equals("abc")||string.equals("abc@")){
           return true;
        } else
        {
            return false;
        }




    }
}
