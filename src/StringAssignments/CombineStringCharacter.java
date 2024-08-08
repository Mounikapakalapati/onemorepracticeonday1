package StringAssignments;

import java.util.Scanner;

public class CombineStringCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string = ");
        String str1 = scan.nextLine();
        System.out.println("Enrer second string = ");
        String str2 = scan.nextLine();

        String output = lastChar(str1,str2);
        System.out.println(output);
    }

    public static String lastChar(String s1 , String s2){

        char firstchar = s1.isEmpty()?'@' :s1.charAt(0);
        char lastchar = s2.isEmpty()?'@':s2.charAt(s2.length()-1);

        String combined = ""+ firstchar+lastchar;
        return combined;
    }

}
