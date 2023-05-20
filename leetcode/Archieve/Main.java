import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Main
 */
public class Main {

        public static void main(String[] args) throws IOException {
                String path = "./img.jpg";

                Path file = Paths.get(path);

                BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

                System.out.println("creationTime Of File Is  = "
                                + attr.creationTime());
                System.out.println("lastAccessTime Of File Is  = "
                                + attr.lastAccessTime());
                System.out.println("lastModifiedTime Of File Is = "
                                + attr.lastModifiedTime());

                System.out.println("size Of File Is = "
                                + attr.size());
                System.out.println("isRegularFile Of File Is = "
                                + attr.isRegularFile());
                System.out.println("isDirectory Of File Is = "
                                + attr.isDirectory());
                System.out.println("isOther Of File Is = "
                                + attr.isOther());

                System.out.println("isSymbolicLink Of File Is  = "
                                + attr.isSymbolicLink());
        }
}