package re.util;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class StringFormatter {
    private static int orderCount = 1;

    public static String formatOrderId(String prefix) {
        StringBuilder orderIdBuider = new StringBuilder();
        orderIdBuider.append(prefix);
        orderIdBuider.append(getCurrentYearMonth());
        orderIdBuider.append(String.format("%02d", orderCount++));

        return orderIdBuider.toString();
    }

    private static String getCurrentYearMonth() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
        return dateFormat.format(date);
    }
}
