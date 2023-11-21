package pl.edu.agh.kis.pz1.model;

import java.util.*;
import junit.framework.TestCase;
import org.junit.Test;

public class HotelTest extends TestCase {
    public void testHotelConstructor() {
        Hotel hotel = new Hotel(15,2);
        assertEquals(15, hotel.listOfRooms.size());
        assertEquals(2, hotel.getNumberOfLevels());
        for(Room room: hotel.listOfRooms) {
            assertNull(room.getGuestName());
            assertFalse(room.isOccupied());

        }
        Hotel hotel1 = new Hotel(100,9);
        assertEquals(100, hotel.listOfRooms.size());
        assertEquals(912, hotel.listOfRooms.get(99).getRoomNumber());
    }
}