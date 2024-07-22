package domain;

import java.util.Objects;

public class AdminUser {
    private Integer id;
    private String name;

    public AdminUser(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Equals, hashCode, and toString
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        AdminUser admin = (AdminUser) obj;
        return id.equals(admin.id) && name.equals(admin.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "UserAdmin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
