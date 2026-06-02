package model;

public class Room {
    private int roomNum;
    private int floor;
    private Guest currentGuest;

    public Room(int roomNum, int floor) {
        this.roomNum = roomNum;
        this.floor = floor;
    }

    public void checkIn(Guest guest) {
        this.currentGuest = guest;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Guest getCurrentGuest() {
        return currentGuest;
    }

    public void setCurrentGuest(Guest currentGuest) {
        this.currentGuest = currentGuest;
    }
}