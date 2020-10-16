import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIO {

    public static void main(String... args)     throws IOException {
        var fileName = "data.txt";
    
    var filePath = Paths.get(fileName);
    if(!Files.exists(filePath)){
    System.out.println("The File "+ fileName + " Could not be found");
        }
        
        Scanner scanner = new Scanner(new File("data.txt"));
        int lineCount = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(lineCount + " The data "  + line);
            lineCount = lineCount + 1;
        }

    }

}

        
