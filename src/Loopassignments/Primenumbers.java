package Loopassignments;

public class Primenumbers {
    public static void main(String[] args) {
        int counter = 0;
        int testInput = 1;
        while(counter <= 20) {
            int num = testInput;


            boolean isNumberPrime = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isNumberPrime = true;
                    break;
                }
            }
            if (!isNumberPrime) {
                System.out.println(testInput);
                counter++;
            }
            testInput++;
        }


    }
    }

