import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class week4HW {

    public static void main(String... args)  throws IOException{
        var fileName = "data.txt";
        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The File "+ fileName + " Could not be found");
        }  

        var userInfos = new ArrayList<String>(); 
      
        var readStream = Files.newBufferedReader(filePath);
        var data = readStream.readLine();
     
        while(data !=null) {               
            data = readStream.readLine(); 
            if(data !=null ) {
                userInfos.add(data);
            }
        }
       
        var names = new ArrayList<String>();
        var addresses = new ArrayList<String>();
        var phoneNumbers = new ArrayList<String>();
        for (var userData : userInfos) {
            var elements  = userData.split(", ");
            for (int i = 0; i < 3; i++) {
                var element = elements[i];
                if (i == 0) {
                    names.add(element);
                }
                else if (i == 1) {
                    addresses.add(element);
                }
                else if (i == 2) {
                    phoneNumbers.add(element);
                }
            }
        }
        
        System.out.println("------------ NAMES -----------"); 
        for (var name : names) {
            System.out.println(name);
        }
        System.out.println("------------ ADDRESSES -----------");   
        for (var address : addresses) {
            System.out.println(address);
        }
        System.out.println("------------ PHONES -----------");
        for (var phone : phoneNumbers) {
            System.out.println(phone);
        }

        // this is step 4 of the assignment
        System.out.println("\n ---- STEP 4 ----\n");
        for (var line : userInfos) {
            if (!line.startsWith("X")) {
                System.out.println(line);
            }
        }
    }
}