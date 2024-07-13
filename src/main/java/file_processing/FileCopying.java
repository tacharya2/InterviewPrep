package file_processing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
Have used three different ways to read and write into the files. Files.newInputStream(Paths.get(from)) being the most modern way to handle
 */
public class FileCopying {
    public static void main(String[] args) {
        String from = "E:\\Moved Desktop\\File\\Source.txt";
        String to = "E:\\Moved Desktop\\File\\Destination.txt";
        try (//BufferedReader br = new BufferedReader(new FileReader(from));
             BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(from)), StandardCharsets.UTF_8));
             //BufferedWriter bw = new BufferedWriter(new FileWriter(to))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(to), StandardCharsets.UTF_8))){
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // To write a new line character
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}