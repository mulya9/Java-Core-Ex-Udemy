package work_vis_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccesFileEx {
    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("test2.txt","rw")) {

            int a = randomAccessFile.read();
            System.out.println((char) a);
            String line = randomAccessFile.readLine();
            System.out.println(line);

            randomAccessFile.seek(101);
            String line2 = randomAccessFile.readLine();
            System.out.println(line2);

            long position = randomAccessFile.getFilePointer();
            System.out.println(position);

            randomAccessFile.seek(randomAccessFile.length() -1);
            randomAccessFile.writeBytes("\n\t\t\t\t\tWilliam Butler");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
