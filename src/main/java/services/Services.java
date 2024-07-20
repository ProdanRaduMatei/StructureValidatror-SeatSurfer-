package services;
import domain.Building;
import repository.*;

import domain.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Services {
    public static Services services;

    private RepoBuilding repoBuilding = new RepoBuilding();
    private List<Building> buildings;
    private RepoRegularUser repoRegularUser = new RepoRegularUser();
    private List<RegularUser> users;
    private RepoAdminUser repoAdminUser = new RepoAdminUser();
    private List<AdminUser> admins;
    private RepoStorey repoStorey = new RepoStorey();
    private List<Storey> storeys;
    private RepoSeat repoSeat = new RepoSeat();
    private List<Seat> seats;
    private Integer lastSeatID = 16;

    public Services() {
        buildings = new ArrayList<>();
        users = new ArrayList<>();
        admins = new ArrayList<>();
        storeys = new ArrayList<>();
        seats = new ArrayList<>();
    }

    public List<Building> InitBuildings() {
        Building building = new Building(1, new HashMap<>());
        building.getStoreys().put(1, 1);
        building.getStoreys().put(2, 2);
        building.getStoreys().put(3, 3);
        building.getStoreys().put(4, 4);
        buildings.add(building);
        return buildings;
    }

    public void clearMemoryB() {
        buildings.clear();
    }

    public void InitUsers() {
        RegularUser user1 = new RegularUser(1, "user1");
        RegularUser user2 = new RegularUser(2, "user2");
        RegularUser user3 = new RegularUser(3, "user3");
        RegularUser user4 = new RegularUser(4, "user4");
        RegularUser user5 = new RegularUser(5, "user5");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public void clearMemoryRU() {
        users.clear();
    }

    public void InitAdmins() {
        AdminUser admin1 = new AdminUser(1, "admin1");
        AdminUser admin2 = new AdminUser(2, "admin2");
        AdminUser admin3 = new AdminUser(3, "admin3");
        AdminUser admin4 = new AdminUser(4, "admin4");
        AdminUser admin5 = new AdminUser(5, "admin5");
        admins.add(admin1);
        admins.add(admin2);
        admins.add(admin3);
        admins.add(admin4);
        admins.add(admin5);
    }

    public void clearMemoryAU() {
        admins.clear();
    }

    public void InitStoreys() {
        Storey storey1 = new Storey(1, Arrays.asList(1, 2, 3, 4));
        Storey storey2 = new Storey(2, Arrays.asList(5, 6, 7, 8));
        Storey storey3 = new Storey(3, Arrays.asList(9, 10, 11, 12));
        Storey storey4 = new Storey(4, Arrays.asList(13, 14, 15, 16));
        storeys.add(storey1);
        storeys.add(storey2);
        storeys.add(storey3);
        storeys.add(storey4);
    }

    public void clearMemorySt() {
        storeys.clear();
    }

    public void InitSeats() {
        Seat seat1 = new Seat(1, 1, 1, 1, true, true, 0, 0);
        Seat seat2 = new Seat(2, 2, 1, 2, true, false, 0, 0);
        Seat seat3 = new Seat(3, 3, 1, 3, true, false, 0, 0);
        Seat seat4 = new Seat(4, 4, 1, 4, true, false, 0, 0);
        Seat seat5 = new Seat(5, 5, 1, 5, true, false, 0, 0);
        Seat seat6 = new Seat(6, 6, 2, 1, true, false, 0, 0);
        Seat seat7 = new Seat(7, 7, 2, 2, true, false, 0, 0);
        Seat seat8 = new Seat(8, 8, 2, 3, true, false, 0, 0);
        Seat seat9 = new Seat(9, 9, 2, 4, true, false, 0, 0);
        Seat seat10 = new Seat(10, 10, 2, 5, true, false, 0, 0);
        Seat seat11 = new Seat(11, 11, 3, 1, true, false, 0, 0);
        Seat seat12 = new Seat(12, 12, 3, 2, true, false, 0, 0);
        Seat seat13 = new Seat(13, 13, 3, 3, true, false, 0, 0);
        Seat seat14 = new Seat(14, 14, 3, 4, true, false, 0, 0);
        Seat seat15 = new Seat(15, 15, 3, 5, true, false, 0, 0);
        Seat seat16 = new Seat(16, 16, 4, 1, true, false, 0, 0);
        seats.add(seat1);
        seats.add(seat2);
        seats.add(seat3);
        seats.add(seat4);
        seats.add(seat5);
        seats.add(seat6);
        seats.add(seat7);
        seats.add(seat8);
        seats.add(seat9);
        seats.add(seat10);
        seats.add(seat11);
        seats.add(seat12);
        seats.add(seat13);
        seats.add(seat14);
        seats.add(seat15);
        seats.add(seat16);
    }

    public void clearMemorySe() {
        seats.clear();
    }

    public void Init() {
        InitBuildings();
        InitUsers();
        InitAdmins();
        InitStoreys();
        InitSeats();
    }

    public void clearMemoryS() {
        clearMemoryB();
        clearMemoryRU();
        clearMemoryAU();
        clearMemorySt();
        clearMemorySe();
    }



    //function to get all storeys from a building
    public List<Storey> getStoreysFromBuilding(Integer buildingID) {
        List<Storey> storeysFromBuilding = new ArrayList<>();
        for (Building b : buildings)
            if (b.getId().equals(buildingID))
                for (HashMap.Entry<Integer, Integer> entry : b.getStoreys().entrySet())
                    for (Storey s : storeys)
                        if (s.getId().equals(entry.getValue()))
                            storeysFromBuilding.add(s);
        return storeysFromBuilding;
    }

    //function to get all empty seats from a storey
    public List<Seat> getEmptySeatsFromStorey(Integer storeyID) {
        List<Seat> emptySeatsFromStorey = new ArrayList<>();
        for (Storey s : storeys)
            if (s.getId().equals(storeyID))
                for (Integer seatID : s.getSeats())
                    for (Seat seat : seats)
                        if (seat.getId().equals(seatID) && !seat.getIsOccupied() && seat.getIsSeat())
                            emptySeatsFromStorey.add(seat);
        return emptySeatsFromStorey;
    }

    //function to get all booked seats from a storey
    public List<Seat> getBookedSeatsFromStorey(Integer storeyID) {
        List<Seat> bookedSeatsFromStorey = new ArrayList<>();
        for (Storey s : storeys)
            if (s.getId().equals(storeyID))
                for (Integer seatID : s.getSeats())
                    for (Seat seat : seats)
                        if (seat.getId().equals(seatID) && seat.getIsOccupied() && seat.getIsSeat())
                            bookedSeatsFromStorey.add(seat);
        return bookedSeatsFromStorey;
    }

    //function to get all empty seats from a building
    public List<Seat> getEmptySeatsFromBuilding(Integer buildingID) {
        List<Seat> emptySeatsFromBuilding = new ArrayList<>();
        for (Building b : buildings)
            if (b.getId().equals(buildingID))
                for (HashMap.Entry<Integer, Integer> entry : b.getStoreys().entrySet())
                    for (Storey s : storeys)
                        if (s.getId().equals(entry.getValue()))
                            for (Integer seatID : s.getSeats())
                                for (Seat seat : seats)
                                    if (seat.getId().equals(seatID) && !seat.getIsOccupied())
                                        emptySeatsFromBuilding.add(seat);
        return emptySeatsFromBuilding;
    }

    //function to get all booked seats from a building
    public List<Seat> getBookedSeatsFromBuilding(Integer buildingID) {
        List<Seat> bookedSeatsFromBuilding = new ArrayList<>();
        for (Building b : buildings)
            if (b.getId().equals(buildingID))
                for (HashMap.Entry<Integer, Integer> entry : b.getStoreys().entrySet())
                    for (Storey s : storeys)
                        if (s.getId().equals(entry.getValue()))
                            for (Integer seatID : s.getSeats())
                                for (Seat seat : seats)
                                    if (seat.getId().equals(seatID) && seat.getIsOccupied())
                                        bookedSeatsFromBuilding.add(seat);
        return bookedSeatsFromBuilding;
    }

    //function to book a seat
    public void bookSeat(Integer seatID) {
        for (Seat seat : seats)
            if (seat.getId().equals(seatID))
                if (!seat.getIsOccupied())
                    seat.setIsOccupied(true);
                else
                    System.out.println("The seat is already booked");
    }

    //function to cancel a booking
    public void cancelBooking(Integer seatID) {
        for (Seat seat : seats)
            if (seat.getId().equals(seatID))
                if (seat.getIsOccupied())
                    seat.setIsOccupied(false);
                else
                    System.out.println("The seat is already empty");
    }

    //function to add a storey to a building
    public void addStoreyToBuilding(Integer buildingID, Integer storeyID, Integer columns, Integer rows) {
        Integer seatsNumber = rows * columns;
        boolean exists = false;
        for (Storey s : storeys)
            if (s.getId().equals(storeyID))
                exists = true;
        if (!exists) {
            List<Integer> seatsID = new ArrayList<>();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= columns; j++) {
                    lastSeatID++;
                    seatsID.add(lastSeatID);
                    seats.add(new Seat(lastSeatID, lastSeatID, i, j, true, false, 0, 0));
                }
            }
            Storey storey = new Storey(storeyID, seatsID);
            storeys.add(storey);
            for (Building b : buildings)
                if (b.getId().equals(buildingID)) {
                    HashMap<Integer, Integer> storeys = b.getStoreys();
                    storeys.put(storeyID, storeyID);
                    b.setStoreys(storeys);
                }
        } else
            System.out.println("The storey already exists");
    }

    //function to add a seat to a storey
    public void addSeatsToStorey(Integer seatID) {
        for (Seat seat : seats)
            if (seat.getId().equals(seatID))
                if (!seat.getIsSeat())
                    seat.setIsSeat(true);
                else
                    System.out.println("There is already a seat on this position");
    }

    //function to remove a seat from a storey
    public void removeSeatsFromStorey(Integer seatID) {
        for (Seat seat : seats)
            if (seat.getId().equals(seatID))
                if (seat.getIsSeat())
                    seat.setIsSeat(false);
                else
                    System.out.println("The space is already empty");
    }

    //Getters
    public List<Building> getRepoBuilding() {
        return buildings;
    }

    public RepoSeat getRepoSeat() {
        return repoSeat;
    }

    public RepoStorey getRepoStorey() {
        return repoStorey;
    }

    public static Services getInstance() {
        if (services == null)
            services = new Services();
        return services;
    }

    public RepoRegularUser getRepoRegularUser() {
        return repoRegularUser;
    }

    public RepoAdminUser getRepoAdminUser() {
        return repoAdminUser;
    }



    //Add
    public void addBuilding(Integer id, HashMap<Integer, Integer> storeysID) {
        repoBuilding.addBuilding(id, storeysID);
    }

    public void addStorey(Integer id, List<Integer>seatsID) {
        repoStorey.addStorey(id, seatsID);
    }

    public void addSeat(Integer id, Integer number, Integer row, Integer column, Boolean isSeat, Boolean isOccupied, Integer idUser, Integer idAdmin) {
        repoSeat.addSeat(id, number, row, column, isSeat, isOccupied, idUser, idAdmin);
    }

    public void addRegularUser(Integer id, String name) {
        repoRegularUser.addUser(id, name);
    }

    public void addAdminUser(Integer id, String name) {
        repoAdminUser.addAdmin(id, name);
    }



    //Update
    public void updateBuilding(Integer id, HashMap<Integer, Integer> storeysID) {
        repoBuilding.updateBuilding(id, storeysID);
    }

    public void updateStorey(Integer id, List<Integer> seatsID) {
        repoStorey.updateStorey(id, seatsID);
    }

    public void updateSeat(Integer id, Integer number, Integer row, Integer column, Boolean isSeat, Boolean isOccupied, Integer idUser, Integer idAdmin) {
        repoSeat.updateSeat(id, number, row, column, isSeat, isOccupied, idUser, idAdmin);
    }

    public void updateRegularUser(Integer id, String name) {
        repoRegularUser.updateUser(id, name);
    }

    public void updateAdminUser(Integer id, String name) {
        repoAdminUser.updateAdmin(id, name);
    }




    //Remove
    public void removeBuilding(Integer id) {
        repoBuilding.removeBuilding(id);
    }

    public void removeStorey(Integer id) {
        repoStorey.removeStorey(id);
    }

    public void removeSeat(Integer id) {
        repoSeat.removeSeat(id);
    }

    public void removeRegularUser(Integer id) {
        repoRegularUser.removeUser(id);
    }

    public void removeAdminUser(Integer id) {
        repoAdminUser.removeAdmin(id);
    }
}