package edu.ensicaen.view.display.rendering.renderer;

import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

public interface Renderer {
    void displayFrame();
    void setStepButtonAction(SimulationPresenter simulationPresenter);
    void render();
    void renderDisplayableComponent(DisplayableComponent displayableComponent);
}
