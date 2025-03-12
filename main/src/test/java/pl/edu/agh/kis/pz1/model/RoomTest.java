package pl.edu.agh.kis.pz1.model;

import junit.framework.TestCase;
import org.junit.Test;

public class RoomTest extends TestCase {
    /**
     * Test for the construction of Room
     */
    @Test
    public void testShouldCreateRoomObject() {
//        Room room = new Room();
        Room room1 = new Room(101);
        Room room2 = new Room(0,12,5,false,"A beautiful 5 person room with a beautiful view.");
//        assertNotNull(room);
        assertNotNull(room1);
        assertNotNull(room2);
    }

    /**
     * Testing constructor which gets only the number of the room
     */
    @Test
    public void testConstructor() {
        Room room = new Room();
        Room room1 = new Room(101);
        Room room2 = new Room(0,12,5,false,"A beautiful 5 person room with a beautiful view.");
        assertEquals(101, room1.getRoomNumber());
        assertEquals(1, room1.getRoomLevel());
        assertFalse(room1.isOccupied());
        assertEquals(room1.getRoomCapacity()* 60, room1.getRoomPrice());
        assertEquals(0,room2.getRoomLevel());
        assertEquals(12, room2.getRoomNumber());
        assertEquals(5, room2.getRoomCapacity());
        assertFalse(room2.isOccupied());
        assertEquals("A beautiful 5 person room with a beautiful view.", room2.getRoomDescription());

    }
}