import model.Floor;
import model.Guest;
import model.Hotel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Floor floor1 = new Floor(1, 2);
        Floor floor2 = new Floor(2, 2);

        Hotel hotel = new Hotel("Hotel #1", List.of(floor1, floor2));

        Guest guest1 = new Guest("Jackie", "Jackson");
        Guest guest2 = new Guest("Tito", "Jackson");
        Guest guest3 = new Guest("Jermaine", "Jackson");
        Guest guest4 = new Guest("Marlon", "Jackson");
        Guest guest5 = new Guest("Michael", "Jackson");

        hotel.checkIn(guest1);
        hotel.checkIn(guest2);
        hotel.checkIn(guest3);
        hotel.checkIn(guest4);
        hotel.checkIn(guest5);
    }
}