package StringAssignments;

import java.util.Scanner;

public class FindingallCharinString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data = ");
        String data = scan.nextLine();
        int count = Countcharcters(data);
        System.out.println("Number of characters = "+count);


    }

    public static int Countcharcters(String data){

        int count = 0;
        for (int i = 0; i < data.length(); i++){

            if (data.charAt(i)!= ' '){
                count++;
            }

        }

       return count;

    }

}
