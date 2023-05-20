import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ImageManager
 */
public class ImageManager {

    public static void moveFile(String sourceFilePath, String destinationPath) throws IOException {
        File sourceFile = new File(sourceFilePath);
        if (new File(sourceFile + "/" + sourceFile.getName()).exists())
            return;

        String command = String.format("mv \'%s\' \'%s\'", sourceFilePath, destinationPath);
        System.out.println(command);
        Runtime.getRuntime().exec(command);
    }

    public static List<String> generateFilePath(String basePath) throws IOException {
        List<String> fileList = new ArrayList<>();

        generateFilePathUtil(fileList, basePath);
        return fileList;
    }

    private static void generateFilePathUtil(List<String> fileList, String basePath) throws IOException {
        File file = new File(basePath);

        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (File fileItr : files) {
                generateFilePathUtil(fileList, fileItr.getAbsolutePath());
            }
        } else {
            Path path = file.toPath();
            String tm = path.toString();
            if (tm.endsWith(".jpg") || tm.endsWith(".mp4") || tm.endsWith(".jpeg") || tm.endsWith(".mkv")
                    || tm.endsWith(".3gp") || tm.endsWith(".JPG"))
                fileList.add(path.toString());
        }
    }

    public static Map<Integer, ArrayList<String>> groupByCreationDate(List<String> filesPath) throws IOException {
        Map<Integer, ArrayList<String>> map = new HashMap<>();
        for (String filePath : filesPath) {
            Path path = new File(filePath).toPath();
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
            FileTime fileTime = attributes.creationTime();
            Instant instant = fileTime.toInstant();
            ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
            int year = zonedDateTime.getYear();
            if (map.get(year) == null) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(filePath);
                map.put(year, arrayList);
            } else {
                ArrayList<String> arrayList = (ArrayList<String>) map.get(year);
                arrayList.add(filePath);
                map.put(year, arrayList);
            }
        }
        return map;
    }

    public static void placeFilesInFolders(String outputBasePath, Map<Integer, ArrayList<String>> map)
            throws IOException {

        File parentLocation = new File(outputBasePath);

        if (!parentLocation.exists()) {
            Runtime.getRuntime().exec(String.format("mkdir %s", parentLocation));
        }

        for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
            String outputDir = outputBasePath + "/" + entry.getKey();
            File location = new File(outputDir);

            if (!location.exists()) {
                Runtime.getRuntime().exec(String.format("mkdir %s", outputDir));
            }

            for (String file : entry.getValue()) {
                moveFile(file, outputDir);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileBasePath = "input";
        String outputBasePath = "images";

        List<String> lists = generateFilePath(fileBasePath);
        System.out.println(lists.size());

        Map<Integer, ArrayList<String>> map = groupByCreationDate(lists);
        placeFilesInFolders(outputBasePath, map);
    }
}