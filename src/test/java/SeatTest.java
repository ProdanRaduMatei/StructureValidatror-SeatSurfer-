import domain.Seat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class SeatTest {
    private Seat seat;

    @BeforeEach
    public void setUp() {
        seat = new Seat(1, 1, 1, 1, true, false, 1, 1);
    }

    @Test
    public void testGetId() {
        assertEquals(1, seat.getId());
    }

    @Test
    public void testGetNumber() {
        assertEquals(1, seat.getNumber());
    }

    @Test
    public void testGetRow() {
        assertEquals(1, seat.getRow());
    }

    @Test
    public void testGetColumn() {
        assertEquals(1, seat.getColumn());
    }

    @Test
    public void testGetIsSeat() {
        assertTrue(seat.getIsSeat());
    }

    @Test
    public void testGetIsOccupied() {
        assertFalse(seat.getIsOccupied());
    }

    @Test
    public void testGetIdUser() {
        assertEquals(1, seat.getIdUser());
    }

    @Test
    public void testGetIdAdmin() {
        assertEquals(1, seat.getIdAdmin());
    }

    @Test
    public void testSetId() {
        seat.setId(2);
        assertEquals(2, seat.getId());
    }
}
