package operators;

public class ShiftOperatorDemo {

    public static void main(String[] args) {
        int i = 10;
        // 101000

        // left shift
       i =  i << 2;
        System.out.println(i);


        int j = 10;
        int k = 7;
        int m = -10;
        System.out.println(j+ k);
        System.out.println(j-k);
        System.out.println(j*k);
        System.out.println(j/k);
        System.out.println(j%k);
        System.out.println(m%k);
    }
}
