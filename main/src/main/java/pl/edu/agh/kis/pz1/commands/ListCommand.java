package pl.edu.agh.kis.pz1.commands;
import pl.edu.agh.kis.pz1.model.Hotel;
import pl.edu.agh.kis.pz1.model.Room;


public class ListCommand extends Command{

   public static void listOfRooms(Hotel hotel) {
       System.out.println("List of rooms:");
       for(Room room: hotel.listOfRooms) {
           System.out.println(room.getRoomNumber() + ", " + (room.isOccupied()? "occupied" : "free"));
       }
   }
   public static void listOfFreeRooms(Hotel hotel) {
       System.out.println("List of free rooms: ");
       for  (Room room: hotel.listOfRooms) {
           if(!room.isOccupied()) {
               System.out.println(room.getRoomNumber() + ", room capacity - " + room.getRoomCapacity());
           }
       }

    }


}
