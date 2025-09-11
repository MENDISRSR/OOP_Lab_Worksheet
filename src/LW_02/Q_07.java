package LW_02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Q_07 {
    public static void main(String[] args) {
        Date myDate = new Date(125, Calendar.SEPTEMBER,14);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, MMMM d, YYYY");
        System.out.println(simpleDateFormat.format(myDate));
    }
}
