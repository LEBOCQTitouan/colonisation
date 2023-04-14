package edu.ensicaen;

import edu.ensicaen.model.Sequencer;
import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.view.SimualtionView;

public class Main {
    public static void main(String[] args) {
        Sequencer sequencer = new Sequencer();
        SimualtionView simulationView = new SimualtionView();
        SimulationPresenter simulationPresenter = new SimulationPresenter(sequencer, simulationView);
    }
}