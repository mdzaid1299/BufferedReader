import java.io.*;

public class BufferedWriteExample {


    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("res//online.txt");
        BufferedWriter bufferedWriteExample = new BufferedWriter(writer);
        bufferedWriteExample.write("welcome to java");
    }
}