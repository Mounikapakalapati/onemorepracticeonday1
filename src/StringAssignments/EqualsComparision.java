package StringAssignments;

public class EqualsComparision {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

       boolean result1 = str1==str2;
        System.out.println(result1);  // here it is checking two values with same reference object.

       boolean result2 = str1==str3;
        System.out.println(result2);   // here str3 is stored in new object reference of object is not same

       boolean result3 = str1.equals(str2);
        System.out.println(result3);

       boolean result4 = str1.equals(str3);
        System.out.println(result4);


        // == Used to compare primitives or check if two references point to the same object.
        // equals method used to compare content or state of the objects.


    }
}
