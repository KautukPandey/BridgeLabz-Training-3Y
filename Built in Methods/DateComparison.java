package Day8;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Enter two Dates");
        String d1 = ob.nextLine();
        String d2 = ob.nextLine();

        LocalDate date1 = LocalDate.parse(d1, formatter);
        LocalDate date2 = LocalDate.parse(d2, formatter);

        if(date1.isBefore(date2))
            System.out.println("Date1 is Before Date2");
        else if(date1.isBefore(date2))
            System.out.println("Date1 is After Date2");
        else if(date1.isEqual(date2))
            System.out.println("Equal");
    }

}
