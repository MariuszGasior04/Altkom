package pl.altkom.zad6_12;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendar {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        System.out.println(today.getDayOfWeek());

        LocalDate firstDecember = LocalDate.of(2019, Month.DECEMBER, 1);
        Month m = firstDecember.getMonth();
        System.out.println(m.toString() + " " + today.getYear());
        //System.out.println(firstDecember.getDayOfWeek());

        for (DayOfWeek dow: DayOfWeek.values()) {
            System.out.printf("%3s", dow.getDisplayName(TextStyle.NARROW_STANDALONE, new Locale("pl", "PL")));
        }
        System.out.println();
        while (firstDecember.isBefore(LocalDate.of(2020, Month.JANUARY, 1))) {
            for (DayOfWeek dow : DayOfWeek.values()) {
                if (firstDecember.getDayOfWeek() == dow && firstDecember.isBefore(LocalDate.of(2020, Month.JANUARY, 1))) {
                    System.out.printf("%3s", firstDecember.getDayOfMonth());
                    firstDecember = firstDecember.plusDays(1);
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
        System.out.println();


//        Locale.setDefault(Locale.CHINA);
//        DateTimeFormatter formatter
//                = DateTimeFormatter.ofPattern("dd MMMM YYYY");
//        System.out.println(formatter.format(today));
//
//        Locale locale = Locale.getDefault();
//        System.out.println(locale);
//        System.out.println(
//                NumberFormat.getCurrencyInstance()
//                        .format(99999.99));
    }
}
