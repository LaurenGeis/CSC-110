package CSC110;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.PriorityQueue;
import java.util.Stack;
public class weekFiveInClassAssmt{

    public static void main(String... args)  throws IOException{
        var fileName = "data (1).txt";
        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The File "+ fileName + " Could not be found");
        }
        
        PriorityQueue<userInfo> userInfos = new PriorityQueue<userInfo>();
        
        
      
        var readStream = Files.newBufferedReader(filePath);
        var data = readStream.readLine(); 
     
        while(data !=null) {               
            data = readStream.readLine(); 
            if(data !=null ) {
                var elements = data.split(",");
                var userInfo = new userInfo();
                userInfo.names = elements[0];
                userInfo.addresses = elements[1];
                userInfo.phones = elements[2];
                userInfos.offer(userInfo);
            }        
           
        }
        readStream.close();
     
        var outFleName = "data_sorted.txt";
        var outFilePath = Paths.get(outFleName);
        var writeStream = Files.newBufferedWriter(outFilePath);
        for (var userData : userInfos) {
            writeStream.write(userData.names.toUpperCase() + "|" + userData.addresses + "|" + userData.phones);
            writeStream.newLine(); 
        }  
        writeStream.close(); 
        
        System.out.printf("%s ", userInfos);
        System.out.println();

        System.out.printf("%s ", userInfos.peek());
        System.out.println();

        userInfos.poll();
        System.out.printf("%s ", userInfos);

    }

} 


