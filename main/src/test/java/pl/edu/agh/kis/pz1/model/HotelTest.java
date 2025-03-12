package pl.edu.agh.kis.pz1.model;

import junit.framework.TestCase;
import org.junit.Test;

public class HotelTest extends TestCase {
    /**
     * Test for the construction of Hotel
     * from defult and callable constructor
     *
     */
    @Test
    public void testHotelConstructor() {
        Hotel hotel = new Hotel();
        Hotel hotel1 = new Hotel(100,99);
        assertNotNull("Hotel object called", hotel);
        assertNotNull("Hotel Object with a 100 rooms called.", hotel1);
    }
    @Test
    public void testConstructorInitialization() {
        Hotel hotel = new Hotel();
        Hotel hotel5_2 = new Hotel(5,2);
        Hotel hotel45_3 = new Hotel(45,3);
        assertEquals(30,hotel.listOfRooms.size());
        assertEquals( 5, hotel5_2.listOfRooms.size());
        assertEquals(45, hotel45_3.listOfRooms.size()) ;
        for(Room room: hotel.listOfRooms) {
            assertFalse(room.isOccupied());
            assertNull(room.getGuestName());
        }
        for(Room room: hotel5_2.listOfRooms) {
            assertFalse(room.isOccupied());
            assertNull(room.getGuestName());
        }
        for(Room room: hotel45_3.listOfRooms) {
            assertFalse(room.isOccupied());
            assertNull(room.getGuestName());
        }
    }
}