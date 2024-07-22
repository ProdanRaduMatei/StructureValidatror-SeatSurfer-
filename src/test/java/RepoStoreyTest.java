import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.RepoStorey;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepoStoreyTest {
    private RepoStorey repo;

    @BeforeEach
    public void setUp() {
        repo = new RepoStorey();
        repo.getStoreys().clear();
    }

    @Test
    public void testAddStorey() {
        repo.addStorey(1, Arrays.asList(1, 1, 1, 1));
        assertEquals(1, repo.getStoreys().size(), "Storey list should have one storey after addition");
        assertEquals(1, repo.getStoreys().get(0).getId(), "The id of the added storey should be 1");
    }

    @Test
    public void testUpdateStorey() {
        repo.addStorey(1, Arrays.asList(1, 1, 1, 1));
        repo.updateStorey(1, Arrays.asList(2, 2, 2, 2));
        assertEquals(1, repo.getStoreys().size(), "Storey list should have one storey after update");
        assertEquals(2, repo.getStoreys().get(0).getSeats().get(0), "The first seat of the storey should be 2");
    }

    @Test
    public void testRemoveStorey() {
        repo.addStorey(1, Arrays.asList(1, 1, 1, 1));
        repo.removeStorey(1);
        assertEquals(0, repo.getStoreys().size(), "Storey list should be empty after removal");
    }

    @Test
    public void testGetStoreys() {
        repo.addStorey(1, Arrays.asList(1, 1, 1, 1));
        repo.addStorey(2, Arrays.asList(2, 2, 2, 2));
        assertEquals(2, repo.getStoreys().size(), "Storey list should have two storeys after addition");
        assertEquals(1, repo.getStoreys().get(0).getId(), "The id of the first storey should be 1");
        assertEquals(2, repo.getStoreys().get(1).getId(), "The id of the second storey should be 2");
    }
}