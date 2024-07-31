package StringAssignments;

import java.util.Scanner;

public class ReturnPortionOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input String = ");
        String inputstring = scan.nextLine();
        System.out.println("Enter index number = ");
        int index = scan.nextInt();
        String returnstring = returnString(inputstring,index);
        System.out.println(returnstring);

    }

    public static String returnString(String str , int index){

        int length = str.length();
        if(index < 0 || index >= length){
            return str.substring(0 , 2);
        }
        if (index == length - 1){
            return str.substring(index)+str.charAt(0);
        }

        return str.substring(index,Math.min(index + 2 ,length));
    }

}
