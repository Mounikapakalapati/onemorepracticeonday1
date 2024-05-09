package conditionalStatement;

public class IfElseDemo {
    public static void main(String[] args) {
        int age = 16;

        String ageGroup = "";
        if(age  < 18){
            ageGroup = "Children";
        }else if(age >= 18 && age <= 30){
            ageGroup = "Mature";
        }else{
            ageGroup = "Old";
        }

        System.out.println(ageGroup);
    }
}
