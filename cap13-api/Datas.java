import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Datas{

    public static void main(String[] args){
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        
        LocalDateTime nowAtTime1 = localDate.atTime(localTime);
        LocalDateTime nowAtTime2 = localTime.atDate(localDate);

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);

        System.out.println(YearMonth.now().isSupported(ChronoUnit.MONTHS));
        System.out.println(YearMonth.now().isSupported(ChronoField.DAY_OF_MONTH));
        System.out.println(MonthDay.now().isSupported(ChronoField.DAY_OF_MONTH));
        System.out.println(LocalDate.now().isSupported(ChronoUnit.DAYS));
        System.out.println(LocalDate.now().isSupported(ChronoUnit.YEARS));
        System.out.println(LocalDateTime.now().isSupported(ChronoField.HOUR_OF_AMPM));
        System.out.println(LocalDateTime.now().isSupported(ChronoField.YEAR));

        //trabalhandoComApiLegada();
        //calculoDeInteraloDeTempoComDatas();
        formatandoEConvertendoEmTexto();
    }

    public static void trabalhandoComApiLegada(){
        Date date = new Date();
        Instant i = date.toInstant();
        LocalDateTime ldt1 = LocalDateTime.ofInstant(i, ZoneId.systemDefault());

        Calendar calendar = Calendar.getInstance();
        Instant i2 = calendar.toInstant();
        LocalDateTime ldt2 = LocalDateTime.ofInstant(i2, ZoneId.systemDefault());

        Instant i3 = ldt1.toInstant(ZoneOffset.UTC);
        Date date2 = Date.from(i3);

        System.out.println("Date: " + ldt1);
        System.out.println("Calendar: " + ldt2);
        System.out.println("Convertendo LocalDateTime em Date: " + date2);
    }

    public static void calculoDeInteraloDeTempoComDatas(){
        //Duration
        Instant t1 = Instant.EPOCH;
        Instant t2 = Instant.now();
        
        long secondsSinceEpoch = Duration.between(t1, t2).getSeconds();

        System.out.println(secondsSinceEpoch);
        
        //ChronoUnit
        LocalDate birthday = LocalDate.of(1996, 4, 22);
        LocalDate base = LocalDate.of(2019, 6, 18);

        System.out.println("Years: " + ChronoUnit.YEARS.between(birthday, base)); //23
        System.out.println("Months: " + ChronoUnit.MONTHS.between(birthday, base)); //277
        System.out.println("Days: " + ChronoUnit.DAYS.between(birthday, base));  //8457

        //Period
        Period lifeTime = Period.between(birthday, base);

        System.out.println("Years: " + lifeTime.getYears());  //23
        System.out.println("Months: " + lifeTime.getMonths()); //1
        System.out.println("Days: " + lifeTime.getDays());   //27
    }

    public static void formatandoEConvertendoEmTexto(){
        //Formater impressão de datas
        LocalDate birthday = LocalDate.of(1996, 4, 22);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        System.out.println(formatter.format(birthday));
        System.out.println(birthday.format(formatter));

        //String em Date
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = LocalDate.parse("22/04/1996", f1);

        System.out.println(f1.format(d));
    }
}