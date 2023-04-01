package untitled.src.main.java.org.example;

import javax.management.StringValueExp;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.nio.file.Paths;

public class fileCreate {
    public static void main(String[] args) throws IOException {
       Path path = Paths.get("file.txt");
       try {
           Files.createFile(path);
       } catch (IOException e) {
           System.out.println("При создании файла произошла ошибка " + e.getMessage());
       }
        String text = "TEXT";
        String textfin = "";
        for (int i = 0; i < 100; i++) {
            textfin = textfin.concat(text);
        }
        System.out.println(text);
//       FileWriter writer = new FileWriter(text);
//       writer.write(text);
        Files.writeString(path,textfin);
   }

}
