import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class week4InClassAssmt {

    public static void main (String... args) throws IOException {  
        var fileName= "data.txt"; 
        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The file"+ fileName+ "could not be found");
            return;
        }
        var userInfos= new ArrayList<String>();
 
        var readStream= Files.newBufferedReader(filePath);
       
        var isEOF = false; 
        while(! isEOF){ 
       
            var  data= readStream.readLine();
          
            if( data==null){ 
                isEOF = true;
                continue;
            }
            var length = data.length();
            if(length>0){
                userInfos.add(data);
            }
        }
        Collections.reverse(userInfos);
        for (Object item: userInfos) {
            
            System.out.println(item);
        }
        var unsortedData = userInfos.toArray(); 
        Arrays.sort(unsortedData, Collections.reverseOrder());
      
       for(Object item: unsortedData){

           System.out.println(item);
       }
       
    }
    
}