package edu.ensicaen.presenter;

import edu.ensicaen.model.Sequencer;
import edu.ensicaen.view.SimualtionView;

public class SimulationPresenter {
    private final Sequencer sequencer;
    private final SimualtionView simulationView;

    public SimulationPresenter(Sequencer sequencer, SimualtionView simulationView) {
        this.sequencer = sequencer;
        this.sequencer.setSimulationPresenter(this);
        this.simulationView = simulationView;
        this.simulationView.setSimulationPresenter(this);
    }

    public void makeStep(int n) {
        for (int i = 0; i < n; i++) {
            sequencer.step();
        }
    }

    public void updateView() {
        // TODO update view components
        simulationView.askUpdate();
    }
}
