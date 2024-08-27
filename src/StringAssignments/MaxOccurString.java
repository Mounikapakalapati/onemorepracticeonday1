package StringAssignments;

import java.util.Scanner;

public class MaxOccurString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data = ");
        String input = scan.nextLine();

        int[] charCount = countcharacters(input);
        char maxChar = maxChar(charCount);
        System.out.println("maximum char found = "+maxChar+" with "+charCount[maxChar]+" occurances");


    }

    public static char maxChar(int[] charcount){

      char maxChar = 0;
      int maxCount = 0;

      for (int i = 0; i < charcount.length; i++){
          if (charcount[i] > maxCount){
              maxChar = (char) i;
              maxCount = charcount[i];
          }
      }
      return maxChar;
    }
    public static int[] countcharacters(String input){

        int[] charcount = new int[256];

        for (int i = 0; i < input.length(); i++){
            charcount[input.charAt(i)]++;
        }
        return charcount;



    }
}
