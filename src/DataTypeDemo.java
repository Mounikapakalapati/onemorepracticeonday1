public class DataTypeDemo {
    public static void main(String[] args) {
        byte b1 = 127;  // -128 to 127
        //System.out.println(b1);

        // Short 2 bytes
        short s1 = 140;

        // type casting
        b1 = (byte)s1;
        System.out.println(b1);
        byte b2 ;
        short s2 =189;
        b2=(byte)s2;
        System.out.println(b2);

        byte b3 ;
        short s3 =6789;
        b3=(byte)s3;
        System.out.println(b3);

        byte b4 ;
        short s4 =300;
        b4=(byte)s4;
        System.out.println(b4);


    }
}

