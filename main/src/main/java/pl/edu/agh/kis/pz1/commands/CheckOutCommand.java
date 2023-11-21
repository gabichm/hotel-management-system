package pl.edu.agh.kis.pz1.commands;
import pl.edu.agh.kis.pz1.model.*;

public class CheckOutCommand extends Command{

    public static void checkOut(Hotel hotel) {
        int hotelRoomIndex = getRoomIndex(askRoomNumber(), hotel);
        Room room = hotel.listOfRooms.get(hotelRoomIndex);
        if(!room.isOccupied()) {System.out.println("This room is free you can't check out of it."); return;}
        room.setGuestName(null);
        room.setOccupied(false);
    }
}
