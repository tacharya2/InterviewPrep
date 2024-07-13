package file_processing;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileComparing {
    public static void main(String[] args) {
        Path file1Path = Paths.get("E:\\Moved Desktop\\File\\Some_Files\\File1.txt");
        Path file2Path = Paths.get("E:\\Moved Desktop\\File\\Some_Files\\File2.txt");
        Path resultFilePath = Paths.get("E:\\Moved Desktop\\File\\Some_Files\\Result.txt");

        try (
                BufferedReader br1 = new BufferedReader(new InputStreamReader(Files.newInputStream(file1Path), StandardCharsets.UTF_8));
                BufferedReader br2 = new BufferedReader(new InputStreamReader(Files.newInputStream(file2Path), StandardCharsets.UTF_8));
                BufferedWriter resultWriter = Files.newBufferedWriter(resultFilePath, StandardCharsets.UTF_8)
        ) {
            String line1, line2;
            boolean differencesFound = false;
            int lineNumber = 1;

            while((line1 = br1.readLine())!= null && (line2 = br2.readLine())!= null){
                if(!line1.equals(line2)){
                    differencesFound = true;
                    resultWriter.write("Difference detected at line " + lineNumber + ":\n");
                    resultWriter.write("File1: " + line1 + "\n");
                    resultWriter.write("File2: " + line2 + "\n\n");
                    resultWriter.write("===============================================================");
                }
                lineNumber++;
            }
            //Handle remaining lines in file2
            while((line1 = br1.readLine())!= null){
                differencesFound = true;
                resultWriter.write("Difference at line " + lineNumber + ":\n");
                resultWriter.write("File1: " + line1 + "\n");
                resultWriter.write("File2: [No corresponding line]\n\n");
                lineNumber++;
            }
            // Handle remaining lines in file2
            while ((line2 = br2.readLine()) != null) {
                differencesFound = true;
                resultWriter.write("Difference at line " + lineNumber + ":\n");
                resultWriter.write("File1: [No corresponding line]\n");
                resultWriter.write("File2: " + line2 + "\n\n");
                lineNumber++;
            }
            if (differencesFound) {
                System.out.println("Following changes have been detected. Check the result file for details.");
            } else {
                resultWriter.write("No change has been detected.\n");
                System.out.println("No change has been detected.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

