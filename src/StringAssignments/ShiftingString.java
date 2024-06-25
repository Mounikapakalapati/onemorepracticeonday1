package StringAssignments;

public class ShiftingString {

    public static void main(String[] args) {

        String input = "Hello";
        String input2 = "Fast";
        String input3 = "TechE";
        String result = shiftEndBy2(input);
        String result1 = shiftEndBy2(input2);
        String result2 = shiftEndBy2(input3);


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);


    }

     public static String shiftEndBy2(String str){

        if(str.length() <= 2){
            return str;
        }
        String end = str.substring(str.length()-2);
        String start = str.substring(0,str.length()-2);

        return end+start;
    }




}


