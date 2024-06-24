package methodsdemo;

public class NonParaMethod {

    String name;
    String dob;
    String mail;
    long phno;

    public  NonParaMethod() {

        this.name = "Arun";
        this.dob = "10-02-1993";
        this.mail = "arun1234@gmail.com";
        this.phno = 994843084;
    }

    void displaydetails() {

        System.out.println("Name = " + name);
        System.out.println("Date of birth = " + dob);
        System.out.println("Mail Id = " + mail);
        System.out.println("Phone number = " + phno);
    }


    public static void main(String[] args) {

        NonParaMethod np = new NonParaMethod();
        np.displaydetails();



    }
}
