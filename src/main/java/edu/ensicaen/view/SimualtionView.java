package edu.ensicaen.view;

import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.view.display.Renderer;

public class SimualtionView {
    private SimulationPresenter simulationPresenter;
    private final Renderer renderer;

    public SimualtionView() {
        renderer = new Renderer();
    }

    public void setSimulationPresenter(SimulationPresenter simulationPresenter) {
        this.simulationPresenter = simulationPresenter;
        renderer.setStepButtonAction(simulationPresenter);
    }

    public void askModelStep(int n) {
        if (simulationPresenter != null) {
            simulationPresenter.makeStep(n);
        }
    }

    public void askUpdate() {
        // TODO
    }

    public void displayGUI() {
        renderer.display();
    }
}
