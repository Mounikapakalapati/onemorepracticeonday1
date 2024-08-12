package StringAssignments;

import java.util.Scanner;

public class ContainRar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any statement = ");
        String input = scan.nextLine();

        boolean output = ContainsRar(input);
        System.out.println(output);

    }
    public static boolean ContainsRar(String string){

        for (int i = 0; i < string.length() - 2; i++){
            if (string.charAt(i) == 'r' && string.charAt(i+2) == 'r'){
                return true;
            }
        }
        return false;
    }
}
