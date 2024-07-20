package ui;

import services.Services;

import java.util.Scanner;

public class Contoller {
    public Services services = new Services();

    public void UI() {
        services.Init();
        Integer option = -1;
        System.out.println("Welcome!");
        while (option != 0) {
            menu();
            System.out.println("Choose an option: ");
            option = readInteger();
            switch (option) {
                case 0:
                    System.out.println("Goodbye!");
                    clearMemoryC();
                    break;
                case 1:
                    System.out.println(services.getRepoBuilding());
                    break;
                case 2:
                    System.out.println("Enter the building id: ");
                    Integer buildingID = readInteger();
                    System.out.println(services.getStoreysFromBuilding(buildingID));
                    break;
                case 3:
                    System.out.println("Enter the storey id: ");
                    Integer storeyID = readInteger();
                    System.out.println(services.getEmptySeatsFromStorey(storeyID));
                    break;
                case 4:
                    System.out.println("Enter the storey id: ");
                    storeyID = readInteger();
                    System.out.println(services.getBookedSeatsFromStorey(storeyID));
                    break;
                case 5:
                    System.out.println("Enter the building id: ");
                    buildingID = readInteger();
                    System.out.println(services.getEmptySeatsFromBuilding(buildingID));
                    break;
                case 6:
                    System.out.println("Enter the building id: ");
                    buildingID = readInteger();
                    System.out.println(services.getBookedSeatsFromBuilding(buildingID));
                    break;
                case 7:
                    System.out.println("Enter the seat id: ");
                    Integer seatID = readInteger();
                    services.bookSeat(seatID);
                    break;
                case 8:
                    System.out.println("Enter the seat id: ");
                    seatID = readInteger();
                    services.cancelBooking(seatID);
                    break;
                case 9:
                    System.out.println("Enter the building id: ");
                    Integer buildingId = readInteger();
                    System.out.println("Enter the storey number: ");
                    Integer storeyNumber = readInteger();
                    System.out.println("Enter the number of columns: ");
                    Integer columns = readInteger();
                    System.out.println("Enter the number of rows: ");
                    Integer rows = readInteger();
                    services.addStoreyToBuilding(buildingId, storeyNumber, columns, rows);
                    break;
                case 10:
                    System.out.println("Enter the seat id: ");
                    Integer seatId = readInteger();
                    services.addSeatsToStorey(seatId);
                    break;
                case 11:
                    System.out.println("Enter the seat id: ");
                    Integer oldSeatId = readInteger();
                    services.removeSeatsFromStorey(oldSeatId);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void menu() {
        System.out.println("0. Exit");
        System.out.println("1. Print all buildings");
        System.out.println("2. Print all storeys from a building");
        System.out.println("3. Print all empty seats from a storey");
        System.out.println("4. Print all booked seats from a storey");
        System.out.println("5. Print all empty seats from a building");
        System.out.println("6. Print all booked seats from a building");
        System.out.println("7. Book a seat");
        System.out.println("8. Cancel a booking");
        System.out.println("9. Add a storey to a building");
        System.out.println("10. Add a seat to a storey");
        System.out.println("11. Remove a seat from a storey");
    }

    private void clearMemoryC() {
        services.clearMemoryS();
    }

    private Integer readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private Boolean readBoolean() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }
}