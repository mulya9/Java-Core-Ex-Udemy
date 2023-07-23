package work_vis_file;

import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) {

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin")))
        {
            outputStream.writeFloat(3.14F);
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeDouble(134.567);
            outputStream.writeShort(120);
            outputStream.writeLong(1_000_000L);
            outputStream.writeInt(500);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
