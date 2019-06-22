import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DataAPI{

    public static void main(String[] args){
        System.out.println(YearMonth.now().isSupported(ChronoUnit.YEAR));
        System.out.println(MonthDay.now().isSupported(ChronoField.DAY_OF_MONTH));
    }
}