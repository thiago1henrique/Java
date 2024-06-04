package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AulaDois {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-06-05");
        LocalDateTime d05 = LocalDateTime.parse("2024-06-05T13:03:23");
        Instant d06 = Instant.parse("2024-06-05T13:03:23Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d05 = " + d05.format(fmt2));


    }
}

