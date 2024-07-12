package StringAssignments;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one String");
        String input = scan.nextLine();

        permutation(input,"");


    }
    public static void permutation(String string , String perm) {

        if (string.isEmpty()) {
            System.out.println(perm);
        } else {
            for (int i = 0; i < string.length(); i++) {
                char character = string.charAt(i);
                String remain = string.substring(0, i) + string.substring(i + 1);
                permutation(remain ,perm + character);
            }
        }


    }



}
