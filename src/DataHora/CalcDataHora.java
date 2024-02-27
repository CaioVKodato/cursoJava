package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcDataHora {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-07-22");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-22T01:30:24");
        Instant d06 = Instant.parse("2024-07-20T01:30:25Z");

        LocalDate pastWeek = d04.minusDays(7);
        LocalDate nextWeek = d04.plusDays(7);

        System.out.println("pastWeek = " + pastWeek);
        System.out.println("nextWeek = " + nextWeek);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);

        System.out.println("pastWeek Instant = " + pastWeekInstant);
        System.out.println("nextWeek Instant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeek.atStartOfDay(),d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime,d05);
        Duration t3 = Duration.between(pastWeekInstant,d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);


        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}
