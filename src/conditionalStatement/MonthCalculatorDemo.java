package conditionalStatement;

public class MonthCalculatorDemo {
    public static void main(String[] args) {
        String monthName = "Jan";
        int monthNumber = -1;

        if(monthName.equals("January") || monthName.equals("Jan")){
            monthNumber = 1;
        }else if(monthName.equals("February")  || monthName.equals("Jan")){
            monthNumber = 2;
        }else if(monthName.equals("March")  || monthName.equals("Mar")){
            monthNumber = 3;
        }

        System.out.println(monthNumber);
    }
}
