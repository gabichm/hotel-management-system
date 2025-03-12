package pl.edu.agh.kis.pz1.commands;
import pl.edu.agh.kis.pz1.model.*;
import java.util.Objects;
import java.util.Scanner;

public class Command extends Hotel {

    String command;

    public Command() {
        this.command = "Default command";
    }

    public Command(String command) {
        command = command;
    }

    public void execute() {
        System.out.println("Executing command: " + command);
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Command command1 = (Command) o;
        return Objects.equals(command, command1.command);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command);
    }

    /**
     * Function which from the room number finds it's index in the vector
     * @param roomNumber number of the roon
     * @param hotel the hotel
     * @return  the room's index
     */
    static int getRoomIndex(int roomNumber, Hotel hotel) {
        int i = 0;
        for(Room room: hotel.listOfRooms) {
            if(room.getRoomNumber() == roomNumber) break;
            ++i;
        }
        if(i == hotel.getNumberOfRooms()) {
            System.out.println("Room doesn't exist.");
        }
        return i;



    }

    /**
     * Function asks about room number
     * @return Returns int with room number
     */
    static  int askRoomNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room number: ");
        return scanner.nextInt();
    }
}
