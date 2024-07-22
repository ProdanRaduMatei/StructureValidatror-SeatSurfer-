package repository;
import domain.AdminUser;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class RepoAdminUser {
    private List<AdminUser> admins;

    public RepoAdminUser() {
        admins = new ArrayList<>();
    }

    public void addAdmin(Integer id, String name) {
        AdminUser admin = new AdminUser(id, name);
        admins.add(admin);
    }

    public void updateAdmin(Integer id, String name) {
        AdminUser admin = new AdminUser(id, name);
        for (AdminUser a : admins)
            if (a.getId().equals(admin.getId()))
                a.setName(admin.getName());
    }

    public void removeAdmin(Integer id) {
        Iterator<AdminUser> iterator = admins.iterator();
        while (iterator.hasNext()) {
            AdminUser admin = iterator.next();
            if (admin.getId() == id)
                iterator.remove();
        }
    }

    public List<AdminUser> getAdmins() {
        return admins;
    }
}
