package W7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Week7InClassAssmnt {


    public static <userInfo> void main(String... args) throws IOException, InterruptedException {
        var fileName = "Sample500.csv";
        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The File "+ fileName + " Could not be found");
        }

        var sampleData = new ArrayList<String>();
        var readStream = Files.newBufferedReader(filePath);
        var data = readStream.readLine();
       
       
        var isEOF = false; 
        while(! isEOF) { 
          
            if( data==null) { 
                isEOF = true;
                continue;
            }
            var length = data.length();
            if(length>0){
                sampleData.add(data);
            }
        }

        while(data !=null) {               
            data = readStream.readLine(); 
            if(data !=null ) {
            data.split(",");
            data.replace(',', '|');
            }        
           

        
            var outFleName = "week_7_sample_data.txt";
            var outFilePath = Paths.get(outFleName);
            var writeStream = Files.newBufferedWriter(outFilePath);
            for (var sortedSampleData : sampleData) {
                writeStream.write(sortedSampleData);
                writeStream.newLine();
               
        
            }
        
        }    

    }
}
   
