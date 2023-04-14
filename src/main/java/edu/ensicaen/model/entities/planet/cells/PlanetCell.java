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
    /**
     * The type of the cell
     */
    private PlanetCellType type;
    /**
     * The list of robots on this cell
     */
    private final List<Robot> robots;
    /**
     * The list of shockwaves on this cell
     */
    private final List<Shockwave> shockwaves;

    public PlanetCell(int x, int y, PlanetCellType type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.robots = new ArrayList<>();
        this.shockwaves = new ArrayList<>();
    }

    /**
     * Get the type of the cell.
     * @return the type of the cell
     */
    public PlanetCellType getType() {
        return type;
    }

    /**
     * Move a robot to this cell.
     * @param robot the robot to move
     */
    public void addRobot(Robot robot) {
        this.robots.add(robot);
        if (robot.getCurrentCell() != null)
            robot.getCurrentCell().removeRobot(robot);
        robot.setCurrentCell(this);
    }

    /**
     * Remove a robot from this cell.
     * @param robot the robot to remove
     */
    public void removeRobot(Robot robot) {
        this.robots.remove(robot);
        robot.setCurrentCell(null);
    }
}
