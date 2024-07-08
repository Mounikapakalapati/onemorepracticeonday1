package StringAssignments;

import java.util.Scanner;

public class DuplicateEnd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data = ");
        String firstString = scan.nextLine();
        System.out.println("Enter number of times duplicate = ");
        int number = scan.nextInt();

        String substring = firstString.substring(firstString.length() - number);

        StringBuilder result = new StringBuilder();

        for (int i = 0;i <number ; i++){
            result.append(substring);
        }
        System.out.println(result);

    }


}
