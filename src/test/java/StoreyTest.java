import domain.Storey;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class StoreyTest {
    private Storey storey;

    @BeforeEach
    public void setUp() {
        storey = new Storey(1, Arrays.asList(1, 2, 3));
    }

    @Test
    public void testGetId() {
        assertEquals(1, storey.getId());
    }

    @Test
    public void testGetSeats() {
        assertEquals(Arrays.asList(1, 2, 3), storey.getSeats());
    }

    @Test
    public void testSetId() {
        storey.setId(2);
        assertEquals(2, storey.getId());
    }

    @Test
    public void testSetSeats() {
        storey.setSeats(Arrays.asList(4, 5, 6));
        assertEquals(Arrays.asList(4, 5, 6), storey.getSeats());
    }

    @Test
    public void testToString() {
        assertEquals("Storey{id=1, seats=[1, 2, 3]}", storey.toString());
    }
}