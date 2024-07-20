package repository;
import domain.Seat;

import java.util.ArrayList;
import java.util.List;

public class RepoSeat {
    private List<Seat> seats = new ArrayList<>();

    public void addSeat(Integer id, Integer number, Integer row, Integer column, Boolean isSeat, Boolean isOccupied, Integer idUser, Integer idAdmin) {
        Seat seat = new Seat(id, number, row, column, isSeat, isOccupied, idUser, idAdmin);
        seats.add(seat);
    }

    public void updateSeat(Integer id, Integer number, Integer row, Integer column, Boolean isSeat, Boolean isOccupied, Integer idUser, Integer idAdmin) {
        Seat seat = new Seat(id, number, row, column, isSeat, isOccupied, idUser, idAdmin);
        for (Seat s : seats)
            if (s.getId().equals(seat.getId())) {
                s.setNumber(seat.getNumber());
                s.setRow(seat.getRow());
                s.setColumn(seat.getColumn());
                s.setIsSeat(seat.getIsSeat());
                s.setIsOccupied(seat.getIsOccupied());
                s.setIdUser(seat.getIdUser());
                s.setIdAdmin(seat.getIdAdmin());
            }
    }

    public void removeSeat(Integer id) {
        for (Seat s : seats)
            if (s.getId().equals(id))
                seats.remove(s);
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
