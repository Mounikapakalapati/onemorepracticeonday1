package operators;

public class UnaryOperatory {
    public static void main(String[] args) {
        // + , - , ++ , -- , !, ~
        //System.out.println(-10);
        // increment and decrement operators
        // pre increment - first increase then assign  , ++i
        // post increment - first assign then increase,  i++

        int i = 10;
        int j = i++ + i++ + --i + ++i + ++i;
        //      10 + 12 + 12 + 12
        System.out.println(i);
        System.out.println(j);

        boolean b1 = true;
        System.out.println(!b1);

        int m1 = -10;
        System.out.println(~m1);

        // it will chnage sign of valye
        // and then it will add -1

        // 10 => -10 + -1 = -11
        // 10 + -1  = 9




    }

}
