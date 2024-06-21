package methodsdemo;

class abc {
    public static void main(String[] args) {

        Methodwithreturn method = new Methodwithreturn();
        int subtraction =  method.sub(5,19);
        System.out.println(subtraction);

        int addition = Methodwithreturn.add(14,34);
        System.out.println(addition);
    }
}

public class Methodwithreturn {

    static int add(int i , int j){
        int k = i+j;
        return k;
    }
    int sub (int a , int b){
        int c = a-b;
        return c;
    }

}
