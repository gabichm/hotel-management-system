package pl.edu.agh.kis.pz1.model;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Vector;

public class Hotel extends Room{
    int numberOfRooms;
    int numberOfLevels;
    public Vector<Room> listOfRooms = new Vector<>(numberOfRooms);
    private int roomPerLevel;
    

    public Hotel() {
        this(30,3);
    }

    public Hotel(int numberOfRooms, int numberOfLevels) {
        roomPerLevel = numberOfRooms/numberOfLevels;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLevels = numberOfLevels;

        for(int i = 0; i < numberOfLevels; ++i) {
            for(int j = 1; j <= roomPerLevel; ++j ) {
                Room room = new Room(100*i+j);
                listOfRooms.add(room);
            }
        }
        for(int i = 1; i <= getNumberOfRooms()%getNumberOfLevels(); ++i) {
            Room room = new Room(i + roomPerLevel);
            listOfRooms.add(room);
        }

    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfLevels() {
        return numberOfLevels;
    }

    public void setNumberOfLevels(int numberOfLevels) {
        this.numberOfLevels = numberOfLevels;
    }

    public Vector<Room> getListOfRooms() {
        return listOfRooms;
    }

    public void setListOfRooms(Vector<Room> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hotel hotel = (Hotel) o;
        return numberOfRooms == hotel.numberOfRooms && numberOfLevels == hotel.numberOfLevels && roomPerLevel == hotel.roomPerLevel && Objects.equals(listOfRooms, hotel.listOfRooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfRooms, numberOfLevels, listOfRooms, roomPerLevel);
    }
}


