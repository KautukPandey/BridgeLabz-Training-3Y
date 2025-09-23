import java.time.LocalDate;
import java.util.*;

class Room {
    int id;
    String type;
    double price;
    public Room(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }
    public String toString() {
        return "Room " + id + " (" + type + ") price " + price;
    }
}

class Booking {
    int id;
    int roomid;
    LocalDate in;
    LocalDate out;
    public Booking(int id, int roomid, LocalDate in, LocalDate out) {
        this.id = id;
        this.roomid = roomid;
        this.in = in;
        this.out = out;
    }
}

class Hotel {
    List<Room> rooms = new ArrayList<>();
    List<Booking> books = new ArrayList<>();

    public void mostbookedroom() {
        LocalDate cut = LocalDate.now().minusMonths(6);
        Map<Integer, Integer> count = new HashMap<>();
        for (Booking b : books) {
            if (!b.in.isBefore(cut)) {
                count.put(b.roomid, count.getOrDefault(b.roomid, 0) + 1);
            }
        }

        int bestid = -1;
        int max = 0;
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if (e.getValue() > max) {
                bestid = e.getKey();
                max = e.getValue();
            }
        }

        if (bestid != -1) {
            Room r = findroom(bestid);
            System.out.println("Most booked room: " + r + " -> " + max + " bookings");
        }
    }

    public Room findroom(int id) {
        for (Room r : rooms) {
            if (r.id == id) return r;
        }
        return null;
    }
    
    
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        Hotel h = new Hotel();

        h.rooms.add(new Room(1, "deluxe", 2000));
        h.rooms.add(new Room(2, "suite", 4000));
        h.rooms.add(new Room(3, "standard", 1000));

        h.books.add(new Booking(1, 1, LocalDate.now().minusDays(5), LocalDate.now()));
        h.books.add(new Booking(2, 2, LocalDate.now().minusMonths(2), LocalDate.now().minusMonths(2).plusDays(3)));
        h.books.add(new Booking(3, 1, LocalDate.now().minusMonths(1), LocalDate.now().minusMonths(1).plusDays(4)));

        h.mostbookedroom();
    }
}