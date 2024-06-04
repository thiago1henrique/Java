package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2024-06-05");
        LocalDateTime d05 = LocalDateTime.parse("2024-06-05T13:03:23");
        Instant d06 = Instant.parse("2024-06-05T13:03:23Z");
        Instant d07 = Instant.parse("2024-06-05T13:03:23-03:00");

        LocalDate d08 = LocalDate.parse("21/08/2024", fmt1);

        LocalDate d10 = LocalDate.of(2024, 7, 13);



        System.out.println(d01);
        System.out.println("---------");
        System.out.println(d02);
        System.out.println("---------");
        System.out.println(d03);
        System.out.println("---------");
        System.out.println(d04);
        System.out.println("---------");
        System.out.println(d05);
        System.out.println("---------");
        System.out.println(d06);
        System.out.println("---------");
        System.out.println(d07);
        System.out.println("---------");
        System.out.println(d08);
        System.out.println("---------");
        System.out.println(d10);

    }
}
