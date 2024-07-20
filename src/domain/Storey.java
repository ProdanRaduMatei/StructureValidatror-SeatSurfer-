package domain;

import java.util.List;

public class Storey {
    private Integer id;
    private List<Integer> seatsID;

    public Storey(Integer id, List<Integer> seatsID) {
        this.id = id;
        this.seatsID = seatsID;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public List<Integer> getSeats() {
        return seatsID;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setSeats(List<Integer> seatsID) {
        this.seatsID = seatsID;
    }

    public String toString() {
        return "Storey{" +
                "id=" + id +
                ", seats=" + seatsID +
                '}';
    }
}