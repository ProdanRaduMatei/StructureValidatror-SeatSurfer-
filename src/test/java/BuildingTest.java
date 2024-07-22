import domain.Building;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

public class BuildingTest {
    private Building building;

    @BeforeEach
    public void setUp() {
        building = new Building(1, new HashMap<Integer, Integer>());
    }

    @Test
    public void testGetId() {
        assertEquals(1, building.getId());
    }

    @Test
    public void testGetStoreys() {
        assertEquals(new HashMap<Integer, Integer>(), building.getStoreys());
    }

    @Test
    public void testSetId() {
        building.setId(2);
        assertEquals(2, building.getId());
    }

    @Test
    public void testSetStoreys() {
        HashMap<Integer, Integer> storeys = new HashMap<Integer, Integer>();
        storeys.put(1, 1);
        building.setStoreys(storeys);
        assertEquals(storeys, building.getStoreys());
    }

    @Test
    public void testToString() {
        assertEquals("Building{id=1, storeys={}}", building.toString());
    }
}
