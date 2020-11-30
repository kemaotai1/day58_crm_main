import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class app {
    public static void main(String[] args) throws ParseException {
        new SimpleDateFormat("yyyy-MM-dd").parse("2015-1-1");
    }
}
