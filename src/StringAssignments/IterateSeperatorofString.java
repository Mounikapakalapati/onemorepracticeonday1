package StringAssignments;

public class IterateSeperatorofString {
    public static void main(String[] args) {

        String input1 = "why";
        String input2 = "@";
        int input3 = 3;

        String input4 = "This";
        String input5 = "and";
        int input6 = 2;

        String output = iterateseperator(input1,input2,input3);
        System.out.println(output);
        String ouput2 = iterateseperator(input4,input5,input6);
        System.out.println(ouput2);

    }

    public static String iterateseperator(String word,String sep , int count){

        StringBuilder result = new StringBuilder();

        for (int i = 0; i< count;i++){

            result.append(word);
            if (i < count-1){
                result.append(sep);
            }
        }
        return result.toString();
        
    }
}
