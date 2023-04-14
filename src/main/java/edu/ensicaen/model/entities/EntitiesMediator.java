package edu.ensicaen.model.entities;

import edu.ensicaen.model.entities.planet.Planet;
import edu.ensicaen.model.entities.planet.cells.PlanetCell;
import edu.ensicaen.model.entities.robots.Robot;
import edu.ensicaen.model.entities.shockwaves.Shockwave;

import java.util.ArrayList;
import java.util.List;

public class EntitiesMediator {
    /**
     * The Planet of the simulation
     */
    private final Planet planet;
    /**
     * The list of shockwaves running through the simulation
     */
    private final List<Shockwave> shockwaves;
    /**
     * The list of robots on the planet
     */
    private final List<Robot> robots;

    public EntitiesMediator() {
        this.planet = new Planet();
        this.shockwaves = new ArrayList<>();
        this.robots = generateRobots();

        int startingX = this.planet.getCells().length / 2;
        int startingY = this.planet.getCells()[0].length / 2;
        PlanetCell startingCell = this.planet.getCells()[startingX][startingY];
        for (Robot robot : this.robots) {
            startingCell.addRobot(robot);
        }
    }

    /**
     * Generate the simulation robots
     * @return the list of robots
     */
    private List<Robot> generateRobots() {
        ArrayList<Robot> generatedRobots = new ArrayList<>();
        generatedRobots.add(new Robot());
        return generatedRobots;
    }
}
