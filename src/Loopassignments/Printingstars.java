package Loopassignments;

import java.util.Scanner;

public class Printingstars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter one number = ");
        int i = scan.nextInt();

        /* Pattern 1*/

        for (int row1 = 1; row1 <= i; row1++) {
            for (int col1 = 1; col1 <= row1; col1++) {
                System.out.print(" *");
            }
            System.out.println();

        }
        System.out.println();

        /* Pattern 2 */
        for (int row2 = 1; row2 <= i; row2++) {
            for (int col2 = 1; col2 <= 2 * (i - row2); col2++) {
                System.out.print(" ");
            }
            for (int col2 = 1; col2 <= row2; col2++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        /* Pattern 3 */

        for (int row3 = i; row3 >= 1; row3--) {

            for (int col3 = 1; col3 <= row3; col3++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        /* Pattern 4 */
        for (int row4 = i; row4 >= 1; row4--) {
            for (int col4 = 1; col4 <= 2 * (i - row4); col4++) {
                System.out.print(" ");
            }
            for (int col4 = 1; col4 <= row4; col4++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        /* Pattern 5 */
        for (int row6 = 0; row6 < i; row6++) {

            for (int col6 = i - 1; col6 > row6; col6--) {
                System.out.print(" ");
            }
            for (int col6 = 0; col6 <= row6; col6++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /* Pattern 6 */

        for (int row5 = 0; row5 < i; row5++) {

            for (int col5 = 0; col5 < row5; col5++) {
                System.out.print(" ");
            }
            for (int col5 = row5; col5 < i; col5++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /* Pattern 7 */

        for (int row7 = 0; row7 < i; row7++) {

            for (int col7 = i - 1; col7 > row7; col7--) {
                System.out.print(" ");
            }

            for (int col7 = 0; col7 <= row7; col7++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int a = 1; a < i; a++) {

            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }

            for (int b = i - 1; b >= a; b--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /* Pattern 8 */

        for (int row8 = 1; row8 <= i; row8++) {
            for (int col8 = 1; col8 <= row8; col8++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int a = i - 1; a >= 1; a--) {

            for (int b = 1; b <= a; b++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        /* Pattern 9 */

        for (int row9 = 1; row9 <= i; row9++) {
            for (int col9 = 1; col9 <= 2 * (i - row9); col9++) {
                System.out.print(" ");
            }
            for (int col9 = 1; col9 <= row9; col9++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int row9 = i - 1; row9 >= 1; row9--) {
            for (int col9 = 1; col9 <= 2 * (i - row9); col9++) {
                System.out.print(" ");
            }
            for (int col9 = 1; col9 <= row9; col9++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        /* Pattern 12 */

        for (int row12 = i; row12 >= 1; row12--) {

            for (int col12 = 1; col12 <= row12; col12++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int row12 = 1; row12 <= i; row12++) {
            for (int col12 = 1; col12 <= row12; col12++) {
                System.out.print(" *");
            }
            System.out.println();

        }
        System.out.println();

        /* Pattern 13 */

        for (int row13 = i; row13 >= 1; row13--) {
            for (int col13 = 1; col13 <= 2 * (i - row13); col13++) {
                System.out.print(" ");
            }
            for (int col13 = 1; col13 <= row13; col13++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int row13 = 1; row13 <= i; row13++) {
            for (int col13 = 1; col13 <= 2 * (i - row13); col13++) {
                System.out.print(" ");
            }
            for (int col13 = 1; col13 <= row13; col13++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
        /* Pattern 14 */

        for (int row14 = 0; row14 < i; row14++) {

            for (int col14 = 0; col14 < row14; col14++) {
                System.out.print(" ");
            }
            for (int col14 = row14; col14 < i; col14++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row14 = 0; row14 < i; row14++) {

            for (int col14 = i - 1; col14 > row14; col14--) {
                System.out.print(" ");
            }
            for (int col14 = 0; col14 <= row14; col14++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();




        }

}







