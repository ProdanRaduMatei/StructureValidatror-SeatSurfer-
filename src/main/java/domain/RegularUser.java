package domain;

public class RegularUser {
    private Integer id;
    private String name;


    public RegularUser(Integer id, String name) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        RegularUser user = (RegularUser) obj;
        return id.equals(user.id) && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return id.hashCode() + name.hashCode();
    }

    @Override
    public String toString() {
        return "RegularUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
