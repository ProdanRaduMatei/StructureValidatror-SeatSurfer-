package repository;
import domain.AdminUser;

import java.util.List;


public class RepoAdminUser {
    private List<AdminUser> admins;

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
        for (AdminUser a : admins)
            if (a.getId().equals(id))
                admins.remove(a);
    }

    public List<AdminUser> getAdmins() {
        return admins;
    }
}
