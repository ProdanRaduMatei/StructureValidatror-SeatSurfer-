import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.RepoSeat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepoSeatTest {
    private RepoSeat repo;

    @BeforeEach
    public void setUp() {
        repo = new RepoSeat();
        repo.getSeats().clear();
    }

    @Test
    public void testAddSeat() {
        repo.addSeat(1, 1, 1, 1, true, false, 1, 1);
        assertEquals(1, repo.getSeats().size(), "Seat list should have one seat after addition");
        assertEquals(1, repo.getSeats().get(0).getId(), "The id of the added seat should be 1");
        assertEquals(1, repo.getSeats().get(0).getNumber(), "The number of the added seat should be 1");
        assertEquals(1, repo.getSeats().get(0).getRow(), "The row of the added seat should be 1");
        assertEquals(1, repo.getSeats().get(0).getColumn(), "The column of the added seat should be 1");
        assertEquals(true, repo.getSeats().get(0).getIsSeat(), "The isSeat of the added seat should be true");
        assertEquals(false, repo.getSeats().get(0).getIsOccupied(), "The isOccupied of the added seat should be false");
        assertEquals(1, repo.getSeats().get(0).getIdUser(), "The idUser of the added seat should be 1");
        assertEquals(1, repo.getSeats().get(0).getIdAdmin(), "The idAdmin of the added seat should be 1");
    }

    @Test
    public void testUpdateSeat() {
        repo.addSeat(1, 1, 1, 1, true, false, 1, 1);
        repo.updateSeat(1, 2, 2, 2, false, true, 2, 2);
        assertEquals(2, repo.getSeats().get(0).getNumber(), "The number of the seat should be updated to 2");
        assertEquals(2, repo.getSeats().get(0).getRow(), "The row of the seat should be updated to 2");
        assertEquals(2, repo.getSeats().get(0).getColumn(), "The column of the seat should be updated to 2");
        assertEquals(false, repo.getSeats().get(0).getIsSeat(), "The isSeat of the seat should be updated to false");
        assertEquals(true, repo.getSeats().get(0).getIsOccupied(), "The isOccupied of the seat should be updated to true");
        assertEquals(2, repo.getSeats().get(0).getIdAdmin(), "The idAdmin of the seat should be updated to 2");
    }

    @Test
    public void testRemoveSeat() {
        repo.addSeat(1, 1, 1, 1, true, false, 1, 1);
        repo.removeSeat(1);
        assertEquals(0, repo.getSeats().size(), "Seat list should be empty after removal");
    }

    @Test
    public void testGetSeats() {
        repo.addSeat(1, 1, 1, 1, true, false, 1, 1);
        repo.addSeat(2, 2, 2, 2, false, true, 2, 2);
        assertEquals(2, repo.getSeats().size(), "Seat list should have two seats after addition");
        assertEquals(1, repo.getSeats().get(0).getId(), "The id of the first seat should be 1");
        assertEquals(1, repo.getSeats().get(0).getNumber(), "The number of the first seat should be 1");
        assertEquals(1, repo.getSeats().get(0).getRow(), "The row of the first seat should be 1");
        assertEquals(1, repo.getSeats().get(0).getColumn(), "The column of the first seat should be 1");
        assertEquals(true, repo.getSeats().get(0).getIsSeat(), "The isSeat of the first seat should be true");
        assertEquals(false, repo.getSeats().get(0).getIsOccupied(), "The isOccupied of the first seat should be false");
        assertEquals(1, repo.getSeats().get(0).getIdUser(), "The idUser of the first seat should be 1");
        assertEquals(1, repo.getSeats().get(0).getIdAdmin(), "The idAdmin of the first seat should be 1");
        assertEquals(2, repo.getSeats().get(1).getId(), "The id of the second seat should be 2");
        assertEquals(2, repo.getSeats().get(1).getNumber(), "The number of the second seat should be 2");
        assertEquals(2, repo.getSeats().get(1).getRow(), "The row of the second seat should be 2");
        assertEquals(2, repo.getSeats().get(1).getColumn(), "The column of the second seat should be 2");
        assertEquals(false, repo.getSeats().get(1).getIsSeat(), "The isSeat of the second seat should be false");
        assertEquals(true, repo.getSeats().get(1).getIsOccupied(), "The isOccupied of the second seat should be true");
        assertEquals(2, repo.getSeats().get(1).getIdUser(), "The idUser of the second seat should be 2");
        assertEquals(2, repo.getSeats().get(1).getIdAdmin(), "The idAdmin of the second seat should be 2");
    }
}
