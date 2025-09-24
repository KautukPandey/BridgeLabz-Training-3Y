package Day8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatting {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 1 -> \n" + today.format(format1));
        System.out.println("Format 2 -> \n" + today.format(format2));
        System.out.println("Format 3 -> \n" + today.format(format3));
    }

}
