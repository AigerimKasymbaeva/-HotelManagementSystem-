package model;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorNum;
    private int rooms;
    private List<Room> takenRooms;

    public Floor(int floorNum, int rooms) {
        this.floorNum = floorNum;
        this.rooms = rooms;
        this.takenRooms = new ArrayList<>();
    }

    public Room findSpareRoom() {
        if (takenRooms.size() >= rooms) {
            return null;
        } else if (takenRooms.isEmpty()) {
            return new Room(0, floorNum);
        } else {
            Room lastTakenRoom = takenRooms.getLast();
            return new Room(lastTakenRoom.getRoomNum() + 1, floorNum);
        }
    }

    public Room checkIn(Guest guest) {
        Room spareRoom = findSpareRoom();
        if (spareRoom == null) {
            return null;
        } else {
            spareRoom.checkIn(guest);
            takenRooms.add(spareRoom);
            return spareRoom;
        }
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public List<Room> getTakenRooms() {
        return takenRooms;
    }

    public void setTakenRooms(List<Room> takenRooms) {
        this.takenRooms = takenRooms;
    }
}