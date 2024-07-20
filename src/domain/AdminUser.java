package domain;

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

    public String toString() {
        return "UserAdmin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
