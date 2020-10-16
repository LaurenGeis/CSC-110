package CSC110;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeSet;
public class weekFiveInClassAssmt{

    public static void main(String... args)  throws IOException{
        var fileName = "data (1).txt";
        // it is a good habit to check if the file can be found using java code
        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The File "+ fileName + " Could not be found");
        }
        
        // *** Arrays/collections are data structure in memory storage 
        var userInfos = new TreeSet<userInfo>();
      
      
        var readStream = Files.newBufferedReader(filePath);
        var data = readStream.readLine(); // skip the line as this line is usually the header
      
        // ** new key word looping with Java key word while
     
        while(data !=null) { // ** null in java signifies that the value is unknown                 
            data = readStream.readLine(); // read the data line
            if(data !=null ) {
                var elements = data.split(",");
                var userInfo = new userInfo();
                userInfo.names = elements[0];
                userInfo.addresses = elements[1];
                userInfo.phones = elements[2];
                userInfos.add(userInfo);
            }        
           
        }
        readStream.close();// ** why you need to do this??

        // write the data to the file
        var outFleName = "data_sorted.txt";
        var outFilePath = Paths.get(outFleName);
        var writeStream = Files.newBufferedWriter(outFilePath);
        for (var userData : userInfos) {
            writeStream.write(userData.names.toUpperCase() + "|" + userData.addresses + "|" + userData.phones);
            writeStream.newLine();  // ** need to know why you need to do this
        }  
        writeStream.close(); // ** why you need to do this??
    }      
}

