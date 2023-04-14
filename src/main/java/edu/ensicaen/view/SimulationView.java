package edu.ensicaen.view;

import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.view.display.rendering.renderer.JPanelRenderer;
import edu.ensicaen.view.display.rendering.renderer.Renderer;

public class SimulationView {
    private SimulationPresenter simulationPresenter;
    private final Renderer concreteRenderer;

    public SimulationView() {
        concreteRenderer = new JPanelRenderer();
    }

    public void setSimulationPresenter(SimulationPresenter simulationPresenter) {
        this.simulationPresenter = simulationPresenter;
        concreteRenderer.setStepButtonAction(simulationPresenter);
    }

    public void displayGUI() {
        concreteRenderer.displayFrame();
    }

    public void askUpdate(int x, int y) {
        // TODO
    }

    public void updateCanvas() {
        concreteRenderer.render();
    }
}
