package pl.edu.agh.kis.pz1.model;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Room {
    private int roomLevel;
    private int roomNumber;
    private int roomCapacity;

    private boolean isOccupied;
    private int roomPrice;
    private String roomDescription;
    private String guestName;

    Room() {}

    public Room(int roomLevel, int roomNumber, int roomCapacity, boolean isOccupied, String roomDescription) {
        this.roomLevel = roomLevel;
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.isOccupied = isOccupied;
        setRoomPrice();
        this.roomPrice = getRoomPrice();
        this.roomDescription = roomDescription;
    }
    public Room(int roomNumber) {
        roomLevel = roomNumber/100;
        this.roomNumber = roomNumber;
        setRoomCapacity();
        isOccupied = false;
        setRoomPrice();
        setRoomDescription();
    }
    public int getRoomLevel() {
        return roomLevel;
    }

    public void setRoomLevel(int roomLevel) {
        this.roomLevel = roomLevel;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }
    private void setRoomCapacity() {
        Random rand = new Random();
        int n = rand.nextInt(6);
        roomCapacity = n+2;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }
    public void setRoomPrice() {
        this.roomPrice = getRoomCapacity() * 60;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }
    public void setRoomDescription() {
        this.roomDescription = "This is a great " + String.valueOf(getRoomCapacity()) + "-person room!";
    }
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestName() {return guestName;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomLevel == room.roomLevel && roomNumber == room.roomNumber && roomCapacity == room.roomCapacity && isOccupied == room.isOccupied && roomPrice == room.roomPrice && Objects.equals(roomDescription, room.roomDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomLevel, roomNumber, roomCapacity, isOccupied, roomPrice, roomDescription);
    }
}

