package edu.ensicaen.view;

import edu.ensicaen.presenter.dataHandling.DataContainer;
import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.view.display.rendering.renderer.JPanelRenderer;
import edu.ensicaen.view.display.rendering.renderer.Renderer;

/**
 * The view of the simulation. It will display the simulation and transmit the user input to the presenter.
 */
public class SimulationView {
    /**
     * Based on the MVP. The presenter is the one that will handle the user input and the view will be updated by that
     * same presenter.
     */
    private SimulationPresenter simulationPresenter;
    /**
     * The renderer that will display the simulation.
     */
    private final Renderer renderer;

    public SimulationView() {
        renderer = new JPanelRenderer();
    }

    /**
     * Sets the simulation presenter.
     * @param simulationPresenter the simulation presenter
     */
    public void setSimulationPresenter(SimulationPresenter simulationPresenter) {
        this.simulationPresenter = simulationPresenter;
        renderer.setStepButtonAction(simulationPresenter);
    }

    /**
     * Makes the GUI visible to the user.
     */
    public void displayGUI() {
        renderer.displayFrame();
    }

    /**
     * Asks the presenter to update the simulation.
     * @param x the x coordinate of the cell to update
     * @param y the y coordinate of the cell to update
     */
    public void askUpdate(int x, int y) {
        // TODO
    }

    public void askStateUpdate(DataContainer dataContainer) {
        // TODO
    }

    /**
     * Updates the canvas.
     */
    public void updateCanvas() {
        renderer.render();
    }
}
