package work_vis_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("/Users/macbook/Downloads/flowers-g0abfffa3c_1280.jpg");
             FileOutputStream outputStream = new FileOutputStream("flowers-g0abfffa3c_1280.jpg")){

            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
