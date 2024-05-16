package Ifelseassignments;


public class ConsecutiveSquareSum {
    public static void main(String[] args) {
       int Givennumber=2030;
       int initial = 1;


       while (true){
           int sum =0;
           int current = initial;

           while (sum<Givennumber){
               sum = sum+current*current;
               current++;
           }


           if (sum==Givennumber){
               int i = initial;


               while (i<current){
                   System.out.print(" "+i);
               i++;
               }

              break;
           }

           initial++;

       }


    }
}
