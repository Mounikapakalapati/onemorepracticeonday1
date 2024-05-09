package conditionalStatement;

public class SwitchDEmo {
    public static void main(String[] args) {
        String monthName = "Jan";
        int monthNumber = -1;
        switch (monthName){
            case "Jan":
            case "January":
                monthNumber = 1;
                break;
            case "Feb":
            case "February":
                monthNumber = 2;
                break;
        }

        // we have to use break after every statement
        // switch case only with equality
    }
}
