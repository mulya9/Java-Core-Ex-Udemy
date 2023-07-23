package work_vis_file;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("test2.txt");
        File folder = new File("/Users/macbook/Downloads/обучение/урок с файлом");

        System.out.println("file.getAbsolutePath = " + file.getAbsolutePath());
    }
}
