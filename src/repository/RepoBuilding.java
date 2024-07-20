package repository;

import domain.Building;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class RepoBuilding {
    private List<Building> buildings = new ArrayList<>();

    public void addBuilding(Integer id, HashMap<Integer, Integer> storeys) {
        Building building = new Building(id, storeys);
        buildings.add(building);
    }

    public void updateBuilding(Integer id, HashMap<Integer, Integer> storeys) {
        Building building = new Building(id, storeys);
        for (Building b : buildings)
            if (b.getId().equals(building.getId()))
                b.setStoreys(building.getStoreys());
    }

    public void removeBuilding(Integer id) {
        for (Building b : buildings)
            if (b.getId().equals(id))
                buildings.remove(b);
    }

    public List<Building> getBuildings() {
        return buildings;
    }
}