package model;

import java.util.List;

public class Hotel {
    private String hotelName;
    private List<Floor> floors;

    public Hotel(String hotelName, List<Floor> floors) {
        this.hotelName = hotelName;
        this.floors = floors;
    }

    public boolean checkIn(Guest guest) {
        for (Floor floor : floors) {
            Room room = floor.checkIn(guest);
            if (room != null) {
                System.out.println("Гость " + guest.getName() + " " + guest.getSurname() +
                        " заселился в комнату " + (room.getRoomNum() + 1) +
                        ", этаж " + room.getFloor());
                return true;
            }
        }
        System.out.println("Свободных номеров не осталось!");
        return false;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
}