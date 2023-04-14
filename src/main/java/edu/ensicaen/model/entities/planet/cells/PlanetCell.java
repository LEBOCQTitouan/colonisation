package edu.ensicaen.model.entities.planet.cells;

import edu.ensicaen.model.entities.robots.Robot;
import edu.ensicaen.model.entities.shockwaves.Shockwave;

import java.util.ArrayList;
import java.util.List;

public class PlanetCell {
    /**
     * Cache for the x coordinate of the cell
     */
    public final int x;
    /**
     * Cache for the y coordinate of the cell
     */
    public final int y;
    private PlanetCellType type;
    private final List<Robot> robots;
    private final List<Shockwave> shockwaves;

    public PlanetCell(int x, int y, PlanetCellType type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.robots = new ArrayList<>();
        this.shockwaves = new ArrayList<>();
    }

    public PlanetCellType getType() {
        return type;
    }

    public void addRobot(Robot robot) {
        this.robots.add(robot);
        robot.setCurrentCell(this);
    }

    public void removeRobot(Robot robot) {
        this.robots.remove(robot);
        robot.setCurrentCell(null);
    }
}
