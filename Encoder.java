import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class Encoder {

    public static void main(String[] args) {
        String a = "avinash";
        ByteArrayInputStream bis = new ByteArrayInputStream(a.getBytes());
        ByteArrayOutputStream bos = new ByteArrayOutputStream(bis.read());
        System.out.println(String.valueOf(bos.toByteArray()));
    }
}