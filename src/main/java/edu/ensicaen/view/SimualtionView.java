package edu.ensicaen.view;

import edu.ensicaen.presenter.SimulationPresenter;

public class SimualtionView {
    private SimulationPresenter simulationPresenter;

    public SimulationPresenter getSimulationPresenter() {
        return simulationPresenter;
    }

    public void setSimulationPresenter(SimulationPresenter simulationPresenter) {
        this.simulationPresenter = simulationPresenter;
    }

    public void askModelStep(int n) {
        simulationPresenter.makeStep(n);
    }

    public void askUpdate() {
        simulationPresenter.updateView();
    }
}
