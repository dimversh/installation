package installation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File dir = new File("D:\\Games\\res\\icons");
        String folderName = dir.getName();
        StringBuilder log = new StringBuilder();

        try {
            dir.createNewFile();
            log.append("Файл " + folderName + " успешно создан.");
            log.append("\r\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (dir.mkdir()) {
            log.append("Папка " + folderName + " успешно создана.");
            log.append("\r\n");
        } else {
            System.out.println("Something went wrong");
        }

        try (FileWriter writer = new FileWriter("D:\\Games\\temp\\temp.txt", true)) {
            writer.write(log.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
