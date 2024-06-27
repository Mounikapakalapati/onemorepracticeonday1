package StringAssignments;

import java.util.Scanner;

public class TwoStringChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data = ");
        String mainstring = scan.nextLine();
        System.out.println("Enter first string = ");
        String substring1 = scan.nextLine();
        System.out.println("Enter second string = ");
        String substring2 = scan.nextLine();

        boolean result = twoStringChecker(mainstring,substring1,substring2);
        System.out.println(result);

    }

    public static boolean twoStringChecker(String mainstring , String substring1 ,String substring2){

        int count1 = 0;
        int count2 = 0;
        int index = 0;

        while ((index = mainstring.indexOf(substring1,index))!=-1) {
            count1++;
            index += substring1.length();
        }
        index =0;

        while ((index = mainstring.indexOf(substring2,index))!=-1) {
            count2++;
            index += substring2.length();
        }
        return count1 ==1 && count2 ==1 ;

        }
    }


