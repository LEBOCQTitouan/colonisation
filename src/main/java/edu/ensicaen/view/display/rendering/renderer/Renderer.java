package edu.ensicaen.view.display.rendering.renderer;

import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.presenter.dataHandling.DataContainer;
import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

/**
 * The renderer interface that will be implemented by the different renderers of the simulation.
 */
public interface Renderer {
    /**
     * Displays the frame.
     */
    void displayFrame();
    /**
     * Sets the action of the step button.
     * @param simulationPresenter the simulation presenter
     */
    void setStepButtonAction(SimulationPresenter simulationPresenter);
    /**
     * Renders the canvas content.
     */
    void render();
    /**
     * Updates the data display.
     * @param dataContainer the data container
     */
    void updateDataDisplay(DataContainer dataContainer);
    /**
     * Renders a displayable component to the canvas.
     * @param displayableComponent the displayable component
     */
    void renderDisplayableComponent(DisplayableComponent displayableComponent);
}
