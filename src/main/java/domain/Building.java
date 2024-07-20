package domain;

import java.util.HashMap;

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

    public String toString() {
        return "Building{" +
                "id=" + id +
                ", storeys=" + storeys +
                '}';
    }
}
