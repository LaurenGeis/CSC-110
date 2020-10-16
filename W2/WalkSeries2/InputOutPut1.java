package WalkSeries2;
import static java.lang.System.out;
public class InputOutPut1 {

    public static void main(String... args) {
        var startValue = 1;
        var endValue = 10;
        var incrementValue  = 10;
        var startValueTwo = 95;
        var endValueTwo = 100;
        var incrementValueTwo = 5;


    
        out.println("Start of process");
       
        for (startValue = 0; startValue <= endValue; startValue = startValue + incrementValue){ 
                
            PrintData("The Current Value", startValue);
        }
        for (startValueTwo = 95; startValueTwo <= endValueTwo; startValueTwo = startValueTwo + incrementValueTwo) {

            PrintData("The Current Value", startValueTwo);
        }

        out.println(startValue);
        out.println(startValueTwo);

    }

    public static void PrintData(String message, Integer startValue) {
        var header = "-";
        var entireMessage = message + " = " + startValue;
        var messageLength = entireMessage.length();
        System.out.println(header.repeat(messageLength));
        System.out.println(entireMessage);
    }


}