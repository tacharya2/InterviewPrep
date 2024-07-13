package file_processing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeletingFileContent {
    public static void main(String[] args) {
        String filePath = "E:\\Moved Desktop\\File\\Destination.txt";
        try(BufferedWriter br = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(Paths.get(filePath)), StandardCharsets.UTF_8))){
                br.write("");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}