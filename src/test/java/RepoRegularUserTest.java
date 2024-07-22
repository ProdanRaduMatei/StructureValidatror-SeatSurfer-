import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.RepoRegularUser;


import static org.junit.jupiter.api.Assertions.*;


public class RepoRegularUserTest {
    private RepoRegularUser repo;

    @BeforeEach
    public void setUp() {
        repo = new RepoRegularUser();
        repo.getUsers().clear();
    }

    @Test
    public void testAddUser() {
        repo.addUser(1, "Alice");
        assertEquals(1, repo.getUsers().size(), "User list should have one user after addition");
        assertEquals(1, repo.getUsers().get(0).getId(), "The id of the added user should be 1");
        assertEquals("Alice", repo.getUsers().get(0).getName(), "The name of the added user should be Alice");
    }

    @Test
    public void testUpdateUser() {
        repo.addUser(1, "Alice");
        repo.updateUser(1, "Bob");
        assertEquals("Bob", repo.getUsers().get(0).getName(), "The name of the user should be updated to Bob");
    }

    @Test
    public void testRemoveUser() {
        repo.addUser(1, "Alice");
        repo.removeUser(1);
        assertEquals(0, repo.getUsers().size(), "User list should be empty after removal");
    }

    @Test
    public void testGetUsers() {
        repo.addUser(1, "Alice");
        repo.addUser(2, "Bob");
        assertEquals(2, repo.getUsers().size(), "User list should have two users after addition");
        assertEquals(1, repo.getUsers().get(0).getId(), "The id of the first user should be 1");
        assertEquals("Alice", repo.getUsers().get(0).getName(), "The name of the first user should be Alice");
        assertEquals(2, repo.getUsers().get(1).getId(), "The id of the second user should be 2");
        assertEquals("Bob", repo.getUsers().get(1).getName(), "The name of the second user should be Bob");
    }
}
