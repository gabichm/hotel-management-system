package pl.edu.agh.kis.pz1.commands;
import pl.edu.agh.kis.pz1.model.*;

import java.util.Scanner;

public class CheckInCommand extends Command{

    /**
     * Function which checks guest into a hotel
     * @param hotel the hotel
     */
    public static void checkInGuest(Hotel hotel) {
        int hotelRoomIndex = getRoomIndex(askRoomNumber(), hotel);
        Room room = hotel.listOfRooms.get(hotelRoomIndex);
        if(room.isOccupied()) {System.out.println("this room is taken");return;}
        String guestName = askGuestName();
        room.setGuestName(guestName);
        room.setOccupied(true);
    }


    /**
     * Function which gets the name of the guest
     * @return returns string with guests name
     */
    private static String askGuestName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter guest name: ");
        return scanner.nextLine();
    }



}
