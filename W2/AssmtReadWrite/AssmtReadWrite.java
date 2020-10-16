package AssmtReadWrite;


import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.graalvm.compiler.lir.Variable;

public class AssmtReadWrite {

    public static void main(String... args) throws IOException {

        var fileName = 5 lines_of data.txt;
        var file = new File(fileName);
        var lineStream  = Files.lines(file.toPath());
        var lines = lineStream.toArray();
        for (var line : lines) {
            System.out.println(line);
        }
        lineStream.close();         
    }
}
