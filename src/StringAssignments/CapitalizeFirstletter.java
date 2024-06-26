package StringAssignments;

import java.util.Scanner;

public class CapitalizeFirstletter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some data = ");
        String Givenstring = scan.nextLine();

        String result = capitalize(Givenstring);
        System.out.println(result);


    }
    public static String capitalize( String Givenstring){

        String[] words = Givenstring.split("\\s");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toTitleCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        return result.toString().trim();


    }


}
