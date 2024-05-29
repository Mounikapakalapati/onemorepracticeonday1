package Ifelseassignments;

import java.util.Scanner;

public class TickTacToe7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Rahul starts game with number = ");
        int rahulnumber = scan.nextInt();
        int rohitnumber = rahulnumber+1;

        while (true){

            boolean contains7 = false;
            int temp = rohitnumber;

            while (temp !=0){
                if(temp%10 ==7){
                    contains7 = true;
                    break;

                }
                temp= temp/10;
            }

            if (contains7){
                rohitnumber++;
                continue;
            }

     // Here rohitnumber 34,35,36

            boolean divisibleby7 = false;

            for (int i =1;i<=rohitnumber;i++){

                if (rohitnumber%i == 0){

                    temp = i;
                    while (temp !=0){
                        if (temp %10 == 7){
                            divisibleby7 = true;
                            break;
                        }
                        temp/=10;
                    }
                    if (divisibleby7){
                       break;
                    }

                }
            }
            if (divisibleby7){
                rohitnumber++;
                continue;
            }
            System.out.println(rohitnumber);
            break;

        }







    }
}
