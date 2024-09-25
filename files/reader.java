package org.example.io.readwrite;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class RiderTest {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("files/test.txt")){
            while(reader.ready()){
//                int read = reader.read();
                System.out.print((char) reader.read());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

