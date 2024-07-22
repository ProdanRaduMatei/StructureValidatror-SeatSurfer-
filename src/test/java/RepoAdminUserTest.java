import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.RepoAdminUser;
import domain.AdminUser;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RepoAdminUserTest {
    private RepoAdminUser repo;

    @BeforeEach
    public void setUp() {
        repo = new RepoAdminUser();
        repo.getAdmins().clear();
    }

    @Test
    public void testAddAdmin() {
        repo.addAdmin(1, "admin1");
        List<AdminUser> admins = repo.getAdmins();
        assertEquals(1, admins.size(), "Admin list should have one admin after addition");
        assertEquals("admin1", admins.get(0).getName(), "The name of the added admin should be 'admin1'");
    }

    @Test
    public void testUpdateAdmin() {
        repo.addAdmin(1, "admin1");
        repo.updateAdmin(1, "adminUpdated");
        List<AdminUser> admins = repo.getAdmins();
        assertEquals("adminUpdated", admins.get(0).getName(), "The name of the admin should be updated to 'adminUpdated'");
    }

    @Test
    public void testRemoveAdmin() {
        repo.addAdmin(1, "admin1");
        repo.removeAdmin(1);
        assertEquals(0, repo.getAdmins().size(), "Admin list should be empty after removal");
    }

    @Test
    public void testGetAdmins() {
        repo.addAdmin(1, "admin1");
        repo.addAdmin(2, "admin2");
        List<AdminUser> expected = Arrays.asList(new AdminUser(1, "admin1"), new AdminUser(2, "admin2"));
        assertIterableEquals(expected, repo.getAdmins(), "The returned list of admins should match the expected list");
    }
}