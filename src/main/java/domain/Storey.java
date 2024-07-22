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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Storey))
            return false;
        Storey storey = (Storey) obj;
        return id.equals(storey.id) && seatsID.equals(storey.seatsID);
    }

    @Override
    public int hashCode() {
        return id.hashCode() + seatsID.hashCode();
    }

    @Override
    public String toString() {
        return "Storey{" +
                "id=" + id +
                ", seats=" + seatsID +
                '}';
    }
}