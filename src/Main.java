import model.Floor;
import model.Guest;
import model.Hotel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Floor floor1 = new Floor(1, 2);
        Floor floor2 = new Floor(2, 2);

        Hotel hotel = new Hotel("Hotel #1", List.of(floor1, floor2));

        Guest guest1 = new Guest("Aigerim", "Kasymbaeva");
        Guest guest2 = new Guest("Darika", "Kasymbaeva");
        Guest guest3 = new Guest("Kanykei", "Kasymbaeva");
        Guest guest4 = new Guest("Aiganysh", "Kasymbaeva");
        Guest guest5 = new Guest("Jibek", "Kasymbaeva");

        hotel.checkIn(guest1);
        hotel.checkIn(guest2);
        hotel.checkIn(guest3);
        hotel.checkIn(guest4);
        hotel.checkIn(guest5);
    }
}