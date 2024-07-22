import domain.AdminUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class AdminUserTest {
    private AdminUser adminUser;

    @BeforeEach
    public void setUp() {
        adminUser = new AdminUser(1, "admin");
    }

    @Test
    public void testGetId() {
        assertEquals(1, adminUser.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("admin", adminUser.getName());
    }

    @Test
    public void testSetId() {
        adminUser.setId(2);
        assertEquals(2, adminUser.getId());
    }

    @Test
    public void testSetName() {
        adminUser.setName("admin2");
        assertEquals("admin2", adminUser.getName());
    }

    @Test
    public void testToString() {
        assertEquals("UserAdmin{id=1, name='admin'}", adminUser.toString());
    }
}
