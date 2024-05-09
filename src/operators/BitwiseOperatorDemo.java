package operators;

public class BitwiseOperatorDemo {
    public static void main(String[] args) {
        //and and or

        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);


        int i = 80;
        int j = 60;

        System.out.println(i == j  | i > j);
        // false & true = false

        // Bitwise & , | always checkboth conditions
        // logical && , || more logical ,
        // if first condition in and scenario is false, second condition wont check
        // if first condition in or scenario is true , then second condition wont check
    }
}
