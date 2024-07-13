package file_processing;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RenameFilesWithTimestamp {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
        System.out.println(formatter.format(today));
        Path folderPath = Paths.get("E:\\Moved Desktop\\File");

        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(folderPath)) {
            for(Path path : directoryStream){
                if(Files.isRegularFile(path)) {
                    String fileName = path.getFileName().toString();
                    String fileExtension = "";
                    int extensionIndex = fileName.lastIndexOf(".");
                    if (extensionIndex > 0) {
                        fileExtension = fileName.substring(extensionIndex);
                        fileName = fileName.substring(0, extensionIndex);
                    }
                    String timeStampedFileName = fileName  + formatter.format(today) + fileExtension;
                    Path timestampedFilePath = path.resolveSibling(timeStampedFileName);
                    //Change the original filenames with these updated ones.
                    Files.move(path, timestampedFilePath);
                    System.out.println("This One: "+ timeStampedFileName);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
