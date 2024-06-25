package methodsdemo;

public class CalSum {

     int addition(int i , int j){
        int k = i+j;
        return k;
    }
     long addition(long a , long b){
        long c = a+b;
        return c;
    }
     double addition(double d , double e){
        double g = d+e;
        return g;
    }
    float addition(float l , float m){
        float p = l+m;
        return p;
    }

    public static void main(String[] args) {
        CalSum c =new CalSum();

        int sum1 = c.addition(10,30);
        System.out.println(sum1);
        long sum2 = c.addition(103456,30345);
        System.out.println(sum2);
        double sum3 = c.addition(1023456780,30234567);
        System.out.println(sum3);
        float sum4 = (float) c.addition(10.890,30.8765);
        System.out.println(sum4);
    }
}
