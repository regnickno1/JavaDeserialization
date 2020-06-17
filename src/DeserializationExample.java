import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

    public static void main(String[] args) {
        Student student = null;

        try (FileInputStream fos = new FileInputStream("D:\\1.bin");
             ObjectInputStream oos = new ObjectInputStream(fos);) {
            student = (Student) oos.readObject();
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }

        assert student != null;
        System.err.println(student.getName());
        System.err.println(student.getAge());
    }
}
