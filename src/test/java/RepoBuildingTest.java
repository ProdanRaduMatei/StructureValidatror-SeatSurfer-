import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.RepoBuilding;
import domain.Building;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RepoBuildingTest {
    private RepoBuilding repo;

    @BeforeEach
    public void setUp() {
        repo = new RepoBuilding();
        repo.getBuildings().clear();
    }

    @Test
    public void testAddBuilding() {
        repo.addBuilding(1, new HashMap<Integer, Integer>() {{ put(1, 1); }});
        List<Building> buildings = repo.getBuildings();
        assertEquals(1, buildings.size(), "Building list should have one building after addition");
        assertEquals(1, buildings.get(0).getId(), "The id of the added building should be 1");
        assertEquals(new HashMap<Integer, Integer>() {{ put(1, 1); }}, buildings.get(0).getStoreys(), "The storeys of the added building should be {1: 1}");
    }

    @Test
    public void testUpdateBuilding() {
        repo.addBuilding(1, new HashMap<Integer, Integer>() {{ put(1, 1); }});
        repo.updateBuilding(1, new HashMap<Integer, Integer>() {{ put(1, 2); }});
        List<Building> buildings = repo.getBuildings();
        assertEquals(new HashMap<Integer, Integer>() {{ put(1, 2); }}, buildings.get(0).getStoreys(), "The storeys of the building should be updated to {1: 2}");
    }

    @Test
    public void testRemoveBuilding() {
        repo.addBuilding(1, new HashMap<Integer, Integer>() {{ put(1, 1); }});
        repo.removeBuilding(1);
        assertEquals(0, repo.getBuildings().size(), "Building list should be empty after removal");
    }

    @Test
    public void testGetBuildings() {
        repo.addBuilding(1, new HashMap<Integer, Integer>() {{ put(1, 1); }});
        repo.addBuilding(2, new HashMap<Integer, Integer>() {{ put(2, 2); }});
        List<Building> expected = Arrays.asList(new Building(1, new HashMap<Integer, Integer>() {{ put(1, 1); }}), new Building(2, new HashMap<Integer, Integer>() {{ put(2, 2); }}));
        assertIterableEquals(expected, repo.getBuildings(), "The returned list of buildings should match the expected list");
    }
}