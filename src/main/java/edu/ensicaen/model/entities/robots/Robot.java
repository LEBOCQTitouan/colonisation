package edu.ensicaen.model.entities.robots;

import edu.ensicaen.model.entities.planet.cells.PlanetCell;

public class Robot {
    private PlanetCell currentCell;

    public PlanetCell getCurrentCell() {
        return currentCell;
    }

    public void setCurrentCell(PlanetCell currentCell) {
        this.currentCell = currentCell;
    }
}
