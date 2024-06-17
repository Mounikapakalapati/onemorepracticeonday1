package methodsdemo;

public class MethodChaining {

   MethodChaining method1(){
       System.out.println("hi");
       return this;
    }
    MethodChaining method2(){
        System.out.println("helo");
        return this;

    }
}
class Demo{
    public static void main(String[] args) {
        MethodChaining m1 = new MethodChaining();
        m1.method1().method2();
    }
}
