package file_processing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting{
    public static void main(String[] args) {
        String filePath = "E:\\Moved Desktop\\File\\Employee_info_copy.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
            bw.write("All New Employees hired after 07/10/2024 will be listed here ");
            bw.newLine();
            bw.write("Enter Employee Info Legibly");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
