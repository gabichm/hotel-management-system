package pl.edu.agh.kis.pz1;

import pl.edu.agh.kis.pz1.model.*;
import pl.edu.agh.kis.pz1.commands.*;

import java.util.Scanner;

/**
 * Przykładowy kod do zajęć laboratoryjnych 2, 3, 4 z przedmiotu: Programowanie zaawansowane 1
 * @author Paweł Skrzyński
 */
public class Main {
    /**
     * main function created hotel object and manages the rooms
     * @param args not used
     */
    public static void main( String[] args ) {

        String commandList ="Enter Number\n1.List all rooms\n2.List of free rooms\n3.View room details\n4. Check in guest\n5.Check out guest\n6.Exit program\n7.List commands\n";


        Hotel hotel = new Hotel(45,3);
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        System.out.println(commandList);
        while(continueLoop) {
            System.out.print("Enter command: ");
            int command = scanner.nextInt();
            if (command == 6) {continueLoop = false;break;}
            switch(command) {
                case 1:
                    ListCommand.listOfRooms(hotel);
                    continue;
                case 2:
                    ListCommand.listOfFreeRooms(hotel);
                    continue;
                case 3:
                    ViewCommand.viewRoomDetails(hotel);
                    continue;
                case 4:
                    CheckInCommand.checkInGuest(hotel);
                    continue;
                case 5:
                    CheckOutCommand.checkOut(hotel);
                    continue;
                default:
                    System.out.println("Wrong command input. Put in the right number.\n" + commandList);
            }




        }

    }
}
