package pl.edu.agh.kis.pz1.commands;
import pl.edu.agh.kis.pz1.model.*;

public class ViewCommand  extends Command{

    public static void viewRoomDetails(Hotel hotel) {
        int hotelRoomIndex = getRoomIndex(askRoomNumber(), hotel);
        Room room = hotel.listOfRooms.get(hotelRoomIndex);
        System.out.println("Room number: " + room.getRoomNumber() + "\nRoom level: " + room.getRoomLevel() + "\nRoom capacity: "
        + room.getRoomCapacity() + "\nRoom is occupied: " + (room.isOccupied()? "YES\nGuest name: " + room.getGuestName(): "NO") + "\nRoom price: "
        + room.getRoomPrice() + "\nRoom description:  " + room.getRoomDescription());
    }




}
