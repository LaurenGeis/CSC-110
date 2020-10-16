package W6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;

public class inClassArrays {


    public static <userInfo> void main(String... args) throws IOException, InterruptedException {
        var fileName = "Sample100.csv";
        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The File "+ fileName + " Could not be found");
        }
        
        
        
        var userInfos = new ArrayList<String>();

        var readStream= Files.newBufferedReader(filePath);
       
       
        var isEOF = false; 
        while(! isEOF) { 
       
            var  data= readStream.readLine();
          
            if( data==null) { 
                isEOF = true;
                continue;
            }
            var length = data.length();
            if(length>0){
                userInfos.add(data);
            }
        }
        Collections.sort(userInfos);
        for (Object item: userInfos) {
            
            System.out.println(item);
        }

        var outFleName = "data_sorted.txt";
        var outFilePath = Paths.get(outFleName);
        var writeStream = Files.newBufferedWriter(outFilePath);
        for (var userData : userInfos) {
            writeStream.write(userData);
            writeStream.newLine(); 
        }  
        writeStream.close(); 
    
        Instant starts = Instant.now();
        Thread.sleep(10);
        Instant ends = Instant.now();
    
        System.out.println(Duration.between(starts, ends));
    }        

    

      
}


