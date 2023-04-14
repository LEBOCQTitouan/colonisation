package edu.ensicaen.model.entities.shockwaves;

import edu.ensicaen.model.entities.planet.cells.PlanetCell;

import java.util.ArrayList;
import java.util.List;

public class Shockwave {
    private final PlanetCell currentCell;
    private final List<Shockwave> propagation;
    private final int propagationIntensity;

    /**+
     * Creates a shockwave with a propagation intensity.
     * @param currentCell the cell where the shockwave is located.
     * @param propagationIntensity an integer between 0 and 100.
     */
    public Shockwave(PlanetCell currentCell, int propagationIntensity) {
        if (propagationIntensity < 0 || propagationIntensity > 100) {
            throw new IllegalArgumentException("Propagation intensity must be an integer between 0 and 100.");
        }
        this.currentCell = currentCell;
        this.propagationIntensity = propagationIntensity;
        this.propagation = new ArrayList<>();
    }
}
