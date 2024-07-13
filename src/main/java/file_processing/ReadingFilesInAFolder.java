package file_processing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFilesInAFolder {
    public static void main(String[] args) {
        Path folderPath = Paths.get("E:\\Moved Desktop\\File");
        String filesList = "E:\\Moved Desktop\\File\\Some_Files\\Files.txt";
        String foldersList = "E:\\Moved Desktop\\File\\Some_Files\\Folders.txt";
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(folderPath);
            BufferedWriter bwFiles = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(Paths.get(filesList)), StandardCharsets.UTF_8));
            BufferedWriter bwFolders = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(Paths.get(foldersList))));
            // BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(directoryStream))));
            ){
            for(Path filePath : directoryStream){
                if(Files.isRegularFile(filePath)){
                    bwFiles.write(filePath.getFileName().toString());
                    bwFiles.newLine();
                    //Finding a specific file and reading it.
                    if(filePath.getFileName().toString().equals("Employee_info.txt")){
                        try(BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(filePath)))){
                            String line;
                            while((line = br.readLine())!= null){
                                System.out.println(line);
                            }
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }

                    System.out.println("Files: " + filePath.getFileName());
                } else if (Files.isDirectory(filePath)) {
                    bwFolders.write(filePath.getFileName().toString());
                    bwFolders.newLine();
                    System.out.println("Directory: " + filePath.getFileName());
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}