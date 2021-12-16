import java.io.BufferedReader;
import java.io.File;

public class FileReader {
    public static void main(String[] args) {

        try {
            File file = new File("in.txt");
            java.io.FileReader fr = new java.io.FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
