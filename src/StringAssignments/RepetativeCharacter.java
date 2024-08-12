package StringAssignments;

import java.util.Scanner;

public class RepetativeCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string = ");
        String input = scan.nextLine();

        String output = repetativeChar(input);
        System.out.println(output);

    }

    public static String repetativeChar(String string){

        String result = "";
        int count = 1;
        for (int i = 0;i < string.length(); i++){
            if (i + 1 < string.length() && string.charAt(i) == string.charAt(i+1)){
                count++;
            }
            else
            {
                result += string.charAt(i);
                if (count > 1){
                    result += count;
                }
                count = 1;
            }
        }
        return result;

    }
}
