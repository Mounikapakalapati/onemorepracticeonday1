package StringAssignments;

import java.util.Scanner;

public class MixingStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string = ");
        String string1 = scan.nextLine();
        System.out.println("Enter second string = ");
        String string2 = scan.nextLine();

        String result = mixString(string1,string2);
        System.out.println(result);

    }
    public static String mixString(String string1 ,String string2){

      StringBuilder mixed = new StringBuilder();
      int maxlength = Math.max(string1.length() , string2.length());

      for (int i = 0; i<maxlength; i++){
          if (i < string1.length()){
              mixed.append(string1.charAt(i));
          }
          if (i < string2.length()){
              mixed.append(string2.charAt(i));
          }
      }
      return mixed.toString();

    }
}
