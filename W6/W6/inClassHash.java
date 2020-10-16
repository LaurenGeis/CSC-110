package W6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap; 

public class inClassHash {


    public static <userInfo> void main(String... args) throws IOException, InterruptedException {
        var fileName = "Sample100.csv";
        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The File "+ fileName + " Could not be found");
        }
        
       
        HashMap<String, String> hash_map = new HashMap<String, String>();
        var readStream = Files.newBufferedReader(filePath);
        var data = readStream.readLine(); 



     
        while(data !=null) {                 
            data = readStream.readLine(); 
            if(data !=null ) {
                var elements = data.split(",");
                var userData = new userData();

 	hash_map.put("Serial Numbers", elements[0]); 
        hash_map.put("Company Name", elements[1]);
        hash_map.put("Employee", elements[2]); 
        hash_map.put("Description", elements[3]); 
        hash_map.put("Leave", elements[4]); 
              
            }        
           
        }
        readStream.close();

        System.out.println("Initial Mappings are: " + hash_map); 
        
        Instant starts = Instant.now();
        Thread.sleep(10);
        Instant ends = Instant.now();
    
        System.out.println(Duration.between(starts, ends));


    }    

}    