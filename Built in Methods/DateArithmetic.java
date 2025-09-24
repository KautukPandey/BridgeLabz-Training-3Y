package Day8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Date in format dd-MM-yyyy");
        String input = ob.nextLine();

        LocalDate date = LocalDate.parse(input, formatter);
        System.out.println("Current Date " + date.format(formatter));

        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        date = date.minusWeeks(3);

        System.out.println("Changed Date " + date.format(formatter));

    }

}
