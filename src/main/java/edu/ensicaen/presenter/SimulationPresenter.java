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
        System.out.printf("1 - Presenter asks model to make %d steps%n", n);
        for (int i = 0; i < n; i++) {
            sequencer.step();
        }
    }

    public void updateView() {
        System.out.println("2 - View updated");
        simulationView.askUpdate(0,0);
        // TODO compute update coordinates
        // TODO for coordinates update view component
            // simulationView.askUpdate(x,y);
    }
}
