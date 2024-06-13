package Ifelseassignments;

import java.util.Scanner;

public class MoneyReturn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total amount for items = ");
        int boughtamount = scan.nextInt();

        System.out.println("Total Given amount = ");
        int givenamount = scan.nextInt();

        int change = (givenamount - boughtamount);
        System.out.println("Amount to be return = "+change);

        int tenrupeecoins = change/10;
        change = change%10;

        int tworupeecoins = change/2;
        change = change%2;

        int onerupeecoins = change/1;

        System.out.println(tenrupeecoins +" Ten Rupee coins ");
        System.out.println(tworupeecoins +" Two Rupee coins ");
        System.out.println(onerupeecoins +" One Rupee coins ");


    }
}
