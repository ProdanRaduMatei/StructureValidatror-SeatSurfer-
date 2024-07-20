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

    public String toString() {
        return "RegularUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
