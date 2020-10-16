package WalkSeries2;
import static java.lang.System.out;
public class WalkSerierBinary {

    public static void main(String... args) {
        var startValue = 1;
        var endValue = 100;
        var incrementValue  = 2;

        // it is always a good idea to inform what is happening
        out.println("Start of process");
       
        for( 
                startValue = 0; 
                startValue <= endValue ; // compare
                startValue = startValue + incrementValue // increment
            ){ // you process code here
                out.println("Decimal Number = "+ startValue);

                out.println( "Binary Number = " +Integer.toBinaryString(startValue));
              
            }
    }  
}    
        

