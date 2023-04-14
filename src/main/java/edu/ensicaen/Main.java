package edu.ensicaen;

import edu.ensicaen.model.Sequencer;
import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.presenter.dataHandling.DataContainer;
import edu.ensicaen.view.SimulationView;

public class Main {
    public static void main(String[] args) {
        Sequencer sequencer = new Sequencer();
        SimulationView simulationView = new SimulationView();
        SimulationPresenter simulationPresenter = new SimulationPresenter(sequencer, simulationView);

        simulationView.displayGUI();
        simulationView.updateCanvas();
        simulationView.askStateUpdate(new DataContainer(0));
    }
}