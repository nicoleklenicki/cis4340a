//Rule: FIO08

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class R08_FIO08_J {
    public static void main(String[] args) throws IOException {
        byte[] data = {(byte) 0x41, (byte) 0xFF};
        InputStream in = new ByteArrayInputStream(data);

        byte b;
        while ((b = (byte) in.read()) != -1) {
            System.out.println(b);
        }
    }
}
