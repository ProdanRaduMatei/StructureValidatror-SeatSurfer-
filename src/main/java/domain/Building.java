package domain;

import java.util.HashMap;
import java.util.Objects;

public class Building {
    private Integer id;
    private HashMap<Integer, Integer> storeys;

    public Building(Integer id, HashMap<Integer, Integer> storeys) {
        this.id = id;
        this.storeys = storeys;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public HashMap<Integer, Integer> getStoreys() {
        return storeys;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setStoreys(HashMap<Integer, Integer> storeys) {
        this.storeys = storeys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return id == building.id && Objects.equals(storeys, building.storeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storeys);
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", storeys=" + storeys +
                '}';
    }
}
