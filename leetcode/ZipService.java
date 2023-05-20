import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipService {

    public static void main(String[] args) {
        String one = "1,this is mater,this is workflow";
        String two = "2,this is second masete,this is second workflow";
        storeIntoZipFile(Arrays.asList(one, two));
    }

    private static void storeIntoZipFile(List<String> list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            // ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("b.zip"));
            for (String i : list) {
                String[] main = i.split(",");
                String id = main[0];
                String integrationMaster = main[1];
                String integrationWorkflow = main[2];

                // ZipEntry zipEntry = new ZipEntry(id + "/");
                // zipOutputStream.putNextEntry(zipEntry);

                ZipEntry zipEntry2 = new ZipEntry(id + "/integrationMaster.json");
                zipOutputStream.putNextEntry(zipEntry2);
                zipOutputStream.write(integrationMaster.getBytes());

                ZipEntry zipEntry3 = new ZipEntry(id + "/integrationWorkflow.json");
                zipOutputStream.putNextEntry(zipEntry3);
                zipOutputStream.write(integrationWorkflow.getBytes());

            }
            zipOutputStream.close();

            // byte[] bytes = byteArrayOutputStream.toByteArray();

            // String data = java.util.Base64.getEncoder().encodeToString(bytes);

            // System.out.println(data);

            // decodeData(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void decodeData(String data) {
        byte[] decodedData = Base64.getDecoder().decode(data);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(decodedData);

        ZipInputStream zipInputStream = new ZipInputStream(byteArrayInputStream);

        ZipEntry zipEntry;
        try {
            zipEntry = zipInputStream.getNextEntry();
            zipEntry = zipInputStream.getNextEntry();
            System.out.println(zipEntry.getName());

            byte[] storedDa = zipInputStream.readAllBytes();
            System.out.println("Stored data");
            System.out.println(new String(storedDa));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
