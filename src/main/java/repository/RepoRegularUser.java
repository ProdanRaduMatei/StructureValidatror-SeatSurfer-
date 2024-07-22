package repository;

import domain.RegularUser;
import java.util.ArrayList;
import java.util.List;

public class RepoRegularUser {
    private List<RegularUser> users;

    public RepoRegularUser() {
        users = new ArrayList<>();
    }

    public void addUser(Integer id, String name) {
        RegularUser user = new RegularUser(id, name);
        users.add(user);
    }

    public void updateUser(Integer id, String name) {
        RegularUser newUser = new RegularUser(id, name);
        for (RegularUser u : users)
            if (u.getId().equals(newUser.getId()))
                u.setName(newUser.getName());
    }

    public void removeUser(Integer id) {
        users.removeIf(u -> u.getId().equals(id));
    }

    public List<RegularUser> getUsers() {
        return users;
    }
}