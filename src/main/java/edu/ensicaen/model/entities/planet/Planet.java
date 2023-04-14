package edu.ensicaen.model.entities.planet;

import edu.ensicaen.model.entities.planet.cells.PlanetCell;
import edu.ensicaen.model.entities.planet.cells.PlanetCellType;

public class Planet {
    private final PlanetCell[][] cells;

    public Planet() {
        this.cells = new PlanetCell[10][10];
        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < this.cells[i].length; j++) {
                this.cells[i][j] = new PlanetCell(i, j, PlanetCellType.GRASS);
            }
        }
    }

    public PlanetCell[][] getCells() {
        return cells;
    }
}
