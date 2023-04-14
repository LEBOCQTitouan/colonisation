package edu.ensicaen.model.entities.shockwaves;

import edu.ensicaen.model.entities.planet.cells.PlanetCell;

import java.util.ArrayList;
import java.util.List;

public class Shockwave {
    private final PlanetCell currentCell;
    private final List<Shockwave> propagation;

    public Shockwave(PlanetCell currentCell) {
        this.currentCell = currentCell;
        this.propagation = new ArrayList<>();
    }
}
