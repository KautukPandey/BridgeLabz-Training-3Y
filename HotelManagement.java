import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

class Room {
    int roomId;
    String type;
    double price;

    public Room(int roomId, String type, double price) {
        this.roomId = roomId;
        this.type = type;
        this.price = price;
    }
}

class Guest {
    int guestId;
    String name;

    public Guest(int guestId, String name) {
        this.guestId = guestId;
        this.name = name;
    }
}

class Booking {
    int bookingId;
    int roomId;
    int guestId;
    LocalDate checkIn;
    LocalDate checkOut;

    public Booking(int bookingId, int roomId, int guestId, LocalDate checkIn, LocalDate checkOut) {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.guestId = guestId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long getNights() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }
}

class HotelSystem {
    List<Room> rooms = new ArrayList<>();
    List<Guest> guests = new ArrayList<>();
    List<Booking> bookings = new ArrayList<>();

    public void mostBookedRoomLast6Months() {
        LocalDate cutoff = LocalDate.now().minusMonths(6);
        Map<Integer, Long> count = bookings.stream()
                .filter(b -> !b.checkIn.isBefore(cutoff))
                .collect(Collectors.groupingBy(b -> b.roomId, Collectors.counting()));

        count.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> {
                    Room r = rooms.stream().filter(x -> x.roomId == e.getKey()).findFirst().get();
                    System.out.println("Most booked room in 6 months: " + r.type + " (ID " + r.roomId + ") -> " + e.getValue() + " bookings");
                });
    }
}

public class HotelManagement {
    public static void main(String[] args) {
        HotelSystem hotel = new HotelSystem();

        
        hotel.rooms.add(new Room(1, "Deluxe", 2000));
        hotel.rooms.add(new Room(2, "Suite", 4000));
        hotel.rooms.add(new Room(3, "Standard", 1000));

        hotel.guests.add(new Guest(1, "Alice"));
        hotel.guests.add(new Guest(2, "Bob"));
        hotel.guests.add(new Guest(3, "Charlie"));

        hotel.bookings.add(new Booking(1, 1, 1, LocalDate.now().minusDays(5), LocalDate.now()));
        hotel.bookings.add(new Booking(2, 2, 2, LocalDate.now().minusMonths(2), LocalDate.now().minusMonths(2).plusDays(3)));
        hotel.bookings.add(new Booking(3, 1, 3, LocalDate.now().minusMonths(7), LocalDate.now().minusMonths(7).plusDays(2)));
        hotel.bookings.add(new Booking(4, 3, 1, LocalDate.now().minusMonths(1), LocalDate.now().minusMonths(1).plusDays(10)));

        
        hotel.mostBookedRoomLast6Months();
    }
}
