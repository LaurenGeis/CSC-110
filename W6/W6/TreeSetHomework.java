package W6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.TreeSet;
import java.util.Collections;
import java.util.SortedSet;

public class TreeSetHomework {

    public static void main(String... args) throws IOException, InterruptedException {
        var fileName = "Sample100.csv";
        var filePath = Paths.get(fileName);
        if (!Files.exists(filePath)) {
            System.out.println("The File " + fileName + " Could not be found");
        }

        TreeSet<userData> treeInfos = new TreeSet<userData>();

        var readStream = Files.newBufferedReader(filePath);

        var isEOF = false;
        while (!isEOF) {

            var data = readStream.readLine();

            if (data == null) {
                isEOF = true;
                continue;
            }

            var dataSplit = data.split(",");
            userData dataObject = new userData();
            dataObject.serialNumber = dataSplit[0];
            dataObject.companyName = dataSplit[1];
            dataObject.employee = dataSplit[2];
            dataObject.description = dataSplit[3];
            dataObject.leave = dataSplit[4];

            var length = data.length();
            if (length > 0) {
                treeInfos.add(dataObject);
            }

            var outFleName = "tree_sorted.txt";
            var outFilePath = Paths.get(outFleName);
            var writeStream = Files.newBufferedWriter(outFilePath);
            
          
        writeStream.close(); 
        }    
        Instant starts = Instant.now();
        Thread.sleep(10);
        Instant ends = Instant.now();
    
        System.out.println(Duration.between(starts, ends));
        }        

    }
       
