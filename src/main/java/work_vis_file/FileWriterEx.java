package work_vis_file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {

        String text = "Let me not to the marriage of true minds\n" +
                "Admit impediments. Love is not love\n" +
                "Which alters when it alteration finds,\n" +
                "Or bends with the remover to remove:";

        try (FileWriter fileWriter = new FileWriter("test2.txt")){
//            for (int i = 0; i < text.length(); i++) {
//                fileWriter.write(text.charAt(i));
//            }
            fileWriter.write(text);
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
