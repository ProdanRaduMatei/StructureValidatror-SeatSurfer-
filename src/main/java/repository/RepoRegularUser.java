package repository;

import domain.RegularUser;

import java.util.List;

public class RepoRegularUser {
    private List<RegularUser> users;

    public void addUser(Integer id, String name) {
        RegularUser user = new RegularUser(id, name);
        users.add(user);
    }

    public void updateUser(Integer id, String name) {
        RegularUser Newuser = new RegularUser(id, name);
        for (RegularUser u : users)
            if (u.getId().equals(Newuser.getId()))
                u.setName(Newuser.getName());
    }

    public void removeUser(Integer id) {
        for (RegularUser u : users)
            if (u.getId().equals(id))
                users.remove(u);
    }

    public List<RegularUser> getUsers() {
        return users;
    }
}
