package operators;

public class SumOfDigits {
    public static void main(String[] args) {
        int i = 438;
        int sum=0;



        // output as 4+5 = 9

        while(i!=0){

            sum += i%10;
            i=i/10;

        }
        System.out.println(+sum);

        // reverse this number = 98

          int m = 3456;
          int reverse =0;
          int reminder;

          while (m!=0)
          {

              reminder = m%10;
              reverse = reverse * 10 + reminder;
              m=m/10;

          }
        System.out.println(+reverse);

         byte k = (byte)300;

        System.out.println(k);
        int l =10;
        int n=7;
        double db1= l/n;
        double db2 =(double)l/n;
        double db3 =l/(double)n;
        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);



    }
}
