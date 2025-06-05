import java.io.*;
public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            bw.write("Hello");
            bw.close();
        } catch (Exception e) {}
    }
}
