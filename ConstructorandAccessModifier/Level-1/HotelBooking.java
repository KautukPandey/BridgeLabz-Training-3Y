public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking()
    {
        this.guestName = "None";
        this.roomType = "None";
        this.nights = 0;
    }

    HotelBooking(String guestName, String roomType, int nights)
    {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking otherBooking)
    {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }
}
