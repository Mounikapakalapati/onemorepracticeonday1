package methodsdemo;



public class MethodArgument {
    int add(int l , int m){
        return l+m;
    }
}
class B {
    public static void main(String[] args) {

        MethodArgument arg = new MethodArgument();

        arg.add(arg.add(10,20), arg.add(30,40));
    }
}
