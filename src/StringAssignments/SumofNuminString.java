package StringAssignments;

import java.util.Scanner;

public class SumofNuminString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data = ");
        String input = scan.nextLine();

        int sum = SumofNum(input);
        System.out.println(sum);

    }

    public static int SumofNum(String input){

        int sum = 0;
        for (char ch : input.toCharArray()){
            if (Character.isDigit(ch)) {

                    sum += Character.getNumericValue(ch);

            }

        }

        return sum;

    }
}
