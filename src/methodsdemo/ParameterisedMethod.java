package methodsdemo;

public class ParameterisedMethod {

    int age;
    String name;

    void firstperson(String name ,int age){

        System.out.println("firstperson = "+name +" age is "+age);
        System.out.println();
    }

    static void staticmethod(String name , int age){

        System.out.println("Second person = "+name+" age is "+age);
    }


    public static void main(String[] args) {

       ParameterisedMethod par = new ParameterisedMethod();
       par.firstperson("Mounika",28);

        ParameterisedMethod.staticmethod("Daya",25);

    }
}

