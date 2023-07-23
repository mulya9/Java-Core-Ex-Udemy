package work_vis_file.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Reno Logan","Silver");
        Employee employee = new Employee("Den","IT",34,2500.00,car);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))){
            outputStream.writeObject(employee);

            System.out.println("Done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
