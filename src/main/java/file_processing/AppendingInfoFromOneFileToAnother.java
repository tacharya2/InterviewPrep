package file_processing;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class AppendingInfoFromOneFileToAnother {
        public static void main(String[] args) {
            Path folderPath = Paths.get("E:\\Moved Desktop\\File");
            Path filesList = Paths.get("E:\\Moved Desktop\\File\\Some_Files\\Files.txt");
            Path foldersList = Paths.get("E:\\Moved Desktop\\File\\Some_Files\\Folders.txt");
            Path timestampedFilesList = Paths.get("E:\\Moved Desktop\\File\\Some_Files\\Timestamped_Files.txt");
            Path timestampedFoldersList = Paths.get("E:\\Moved Desktop\\File\\Some_Files\\Timestamped_Folders.txt");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");

            try (
                    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(folderPath);
                    BufferedWriter bwFiles = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(filesList), StandardCharsets.UTF_8));
                    BufferedWriter bwFolders = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(foldersList), StandardCharsets.UTF_8));
                    BufferedWriter bwTimestampedFiles = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(timestampedFilesList), StandardCharsets.UTF_8));
                    BufferedWriter bwTimestampedFolders = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(timestampedFoldersList), StandardCharsets.UTF_8))
            ) {
                for (Path filePath : directoryStream) {
                    String fileName = filePath.getFileName().toString();
                    String timestampedFileName = fileName + "_" + dtf.format(LocalDateTime.now());

                    if (Files.isRegularFile(filePath)) {
                        bwFiles.write(fileName);
                        bwFiles.newLine();
                        bwTimestampedFiles.write(timestampedFileName);
                        bwTimestampedFiles.newLine();
                        System.out.println("File: " + fileName + " -> " + timestampedFileName);
                    } else if (Files.isDirectory(filePath)) {
                        bwFolders.write(fileName);
                        bwFolders.newLine();
                        bwTimestampedFolders.write(timestampedFileName);
                        bwTimestampedFolders.newLine();
                        System.out.println("Directory: " + fileName + " -> " + timestampedFileName);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
