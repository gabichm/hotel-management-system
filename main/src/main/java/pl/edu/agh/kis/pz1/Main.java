package pl.edu.agh.kis.pz1;

import pl.edu.agh.kis.pz1.util.TextUtils;
import pl.edu.agh.kis.pz1.model.*;
import pl.edu.agh.kis.pz1.commands.*;

import java.util.Scanner;

/**
 * Przykładowy kod do zajęć laboratoryjnych 2, 3, 4 z przedmiotu: Programowanie zaawansowane 1
 * @author Paweł Skrzyński
 */
public class Main {
    public static void main( String[] args ) {
        System.out.println( "Szablon projektu z metodą main i zależnościami wbudowanymi w wykonywalny jar" );
        //wywołanie metody generującej hash SHA-512
        System.out.println("HASH 512 dla słowa test: " + TextUtils.sha512Hash("test"));

        String commandList ="1.List all rooms\n2.List of free rooms\n3.View room details\n4. Check in guest\n5.Check out guest\n6.Exit program\n";


        Hotel hotel = new Hotel(10,1);
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
                    System.out.println("Wrong command input. Put in the right number." + commandList);
            }




        }

    }
}
