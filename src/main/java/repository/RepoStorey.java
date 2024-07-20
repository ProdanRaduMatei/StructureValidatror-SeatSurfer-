package repository;
import domain.Storey;

import java.util.ArrayList;
import java.util.List;

public class RepoStorey {
    private List<Storey> storeys;

    public RepoStorey() {
        storeys = new ArrayList<>();
    }

    public void addStorey(Integer id, List<Integer> seatsID) {
        Storey layout = new Storey(id, seatsID);
        storeys.add(layout);
    }

    public void updateStorey(Integer id, List<Integer> seatsID) {
        Storey layout = new Storey(id, seatsID);
        for (Storey l : storeys)
            if (l.getId().equals(layout.getId())) {
                l.setSeats(layout.getSeats());
            }
    }

    public void removeStorey(Integer id) {
        storeys.removeIf(l -> l.getId().equals(id));
    }

    public List<Storey> getStoreys() {
        return storeys;
    }
}