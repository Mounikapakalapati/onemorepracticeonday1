package objects;

import java.net.ContentHandler;

public class DisplayingStudentRecords {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Rajesh";
        s1.age = 15;
        s1.grade = 82.3;


        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Suresh";
        s2.age = 14;
        s2.grade = 91.4;

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "Sandeep";
        s3.age = 16;
        s3.grade = 79.4;

        s1.Display(s1.id +" "+ s1.name + s1.age + s1.grade + Student.standard);
        s2.Display(s2.id +" "+ s2.name + s2.age + s2.grade + Student.standard);

        s2.Modify(s2.name);
    }
}
