package StringAssignments;

import java.util.Scanner;

public class PenultimateString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter statement = ");
        String input = scan.nextLine();

        String output = PenultimateStrings(input);
        System.out.println(output);
    }
    public static String PenultimateStrings(String string){

         String[] words = string.trim().split(" ");

         if (words.length >= 2) {
             return words[words.length - 2];
         } else
         {
             return null;
         }


    }

    }

