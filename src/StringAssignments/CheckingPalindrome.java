package StringAssignments;

import java.util.Scanner;

public class CheckingPalindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some digits = ");
        String number = scan.nextLine();

        boolean ispalindrome =checkPalindrome(number);
        System.out.println(ispalindrome);


    }
       public static boolean checkPalindrome (String str) {

          int first = 0;
          int last = str.length() - 1;

          while (first<last){
              if (str.charAt(first) != str.charAt(last)){
                  return false;
              }
              first++;
              last--;
          }
          return true;

    }
}
