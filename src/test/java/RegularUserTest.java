import domain.RegularUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class RegularUserTest {
    private RegularUser regularUser;

    @BeforeEach
    public void setUp() {
        regularUser = new RegularUser(1, "John Doe");
    }

    @Test
    public void testGetId() {
        assertEquals(1, regularUser.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", regularUser.getName());
    }

    @Test
    public void testSetId() {
        regularUser.setId(2);
        assertEquals(2, regularUser.getId());
    }

    @Test
    public void testSetName() {
        regularUser.setName("Jane Doe");
        assertEquals("Jane Doe", regularUser.getName());
    }

    @Test
    public void testToString() {
        assertEquals("RegularUser{id=1, name='John Doe'}", regularUser.toString());
    }
}
