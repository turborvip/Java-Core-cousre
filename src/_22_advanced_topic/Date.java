package _22_advanced_topic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = myFormat.format(myDateTime);
        System.out.println(formatDateTime);
    }
}
