package edu.ensicaen.presenter;

import edu.ensicaen.model.Sequencer;
import edu.ensicaen.view.SimualtionView;

public class SimulationPresenter {
    private final Sequencer sequencer;
    private final SimualtionView simulationView;

    public SimulationPresenter(Sequencer sequencer, SimualtionView simulationView) {
        this.sequencer = sequencer;
        this.simulationView = simulationView;
        this.simulationView.setSimulationPresenter(this);
    }
}
