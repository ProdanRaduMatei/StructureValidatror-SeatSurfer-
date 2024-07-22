import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import services.Services;
import domain.Building;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ServicesTest {
    @Test
    public void testInitBuildings() {
        Services services = Services.getInstance();
        List<Building> buildings = new ArrayList<>();
    }
}
