package pl.edu.agh.kis.pz1.commands;
import pl.edu.agh.kis.pz1.model.*;

import java.util.Scanner;

public class CheckInCommand extends Command{

    public static void checkInGuest(Hotel hotel) {
        int hotelRoomIndex = getRoomIndex(askRoomNumber(), hotel);
        Room room = hotel.listOfRooms.get(hotelRoomIndex);
        if(room.isOccupied()) {System.out.println("This room is already occupied."); return;}
        String guestName = askGuestName();
        room.setGuestName(guestName);
        room.setOccupied(true);
    }



    private static String askGuestName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter guest name: ");
        return scanner.nextLine();
    }



}
