import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTime {

    public static String format(LocalDateTime localDatetime, final String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return localDatetime.atZone(ZoneId.systemDefault()).format(dateTimeFormatter);
    }

    public static void main(String[] args) {
        System.out.println(format(LocalDateTime.now(), "yyyy:MM-dd'T'HH:mm:ss.SSXXX"));
    }

}
