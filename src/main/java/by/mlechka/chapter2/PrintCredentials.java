package by.mlechka.chapter2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintCredentials {

    static void printInformation() {
        String name = "Ирина Млечко";
        LocalDateTime startDateTime = LocalDateTime.of(2023, 4, 11, 21, 20);
        LocalDateTime endDateTime = LocalDateTime.of(2023, 4, 18, 18, 30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Имя: " + name);
        System.out.println("Дата получения: " + startDateTime.format(formatter));
        System.out.println("Дата сдачи: " + endDateTime.format(formatter));
    }
}
