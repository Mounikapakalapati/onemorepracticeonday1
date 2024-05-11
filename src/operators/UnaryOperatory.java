package operators;

public class UnaryOperatory {
    public static void main(String[] args) {
        // + , - , ++ , -- , !, ~
        //System.out.println(-10);
        // increment and decrement operators
        // pre increment - first increase then assign  , ++i
        // post increment - first assign then increase,  i++

        int i = 10;
        double db1 = 14.5d;
        db1++;
        int j = i++ + i++ + --i + ++i + ++i;
        //      10 + 12 + 12 + 12
        System.out.println(i);
        System.out.println(j);
        System.out.println(db1);

        boolean b1 = true;
        System.out.println(!b1);

        int m1 = -10;
        System.out.println(~m1);

        int x=1;
        int y=0;
        if(x++ > ++y){
            System.out.println("Hello");
        }else
        {
            System.out.println("welcome");
        }
        System.out.println("Log" + x +":"+ y);

        // it will chnage sign of valye
        // and then it will add -1

        // 10 => -10 + -1 = -11
        // 10 + -1  = 9




    }

}
