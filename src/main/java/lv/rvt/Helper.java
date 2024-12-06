package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
    

public class Helper {

    public static BufferedReader getReader(String filename) throws IOException {

        return Files.newBufferedReader(getFilePath(filename));

    }
 
    public static BufferedReader getWritter(String filename, StandardOpenOption option) throws IOException {

        return Files.newBufferedWritter(getFilePath(filename), option);
        
    }

    public static BufferedReader getFilePatch(String filename) throws FileNotFoundException {

        Patch FilePatch = Patch.get("data", filename);

        if (!Files.exists(FilePatch)) {

            throw new  FileNotFoundException("File not found: " + filename);

        }

        return FilePatch;

    }

}



        
    

}
