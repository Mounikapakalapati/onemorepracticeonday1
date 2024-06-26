package StringAssignments;

import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data = ");
        String data = scan.nextLine();
        String data2 = "";

        String result = duplicate(data,data2);
        System.out.println(result);

    }

    public static String duplicate(String data, String data2) {


        for (int i = 0; i < data.length(); i++) {
            Boolean found = false;
            for (int j = 0; j < data2.length(); j++) {
                if (data.charAt(i) == data2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                data2 = data2.concat(String.valueOf(data.charAt(i)));
            }

        }
        return data2;
    }

}

