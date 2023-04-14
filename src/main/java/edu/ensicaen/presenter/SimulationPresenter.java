package edu.ensicaen.presenter;

import edu.ensicaen.model.Sequencer;
import edu.ensicaen.view.SimulationView;

/**
 * The presenter of the simulation. It will handle the user input and update the view and interact with the model.
 */
public class SimulationPresenter {
    /**
     * The model of the simulation.
     */
    private final Sequencer sequencer;
    /**
     * The view of the simulation.
     */
    private final SimulationView simulationView;

    public SimulationPresenter(Sequencer sequencer, SimulationView simulationView) {
        this.sequencer = sequencer;
        this.sequencer.setSimulationPresenter(this);
        this.simulationView = simulationView;
        this.simulationView.setSimulationPresenter(this);
    }

    /**
     * Makes n step in the simulation.
     * @param n the number of steps to make
     */
    public void makeStep(int n) {
        System.out.printf("1 - Presenter asks model to make %d steps%n", n);
        for (int i = 0; i < n; i++) {
            sequencer.step();
        }
    }

    /**
     * Updates the view.
     */
    public void updateView() {
        System.out.println("2 - View updated");
        // visualization of the simulation
        // TODO compute update coordinates
        // TODO for coordinates update view component
            // simulationView.askUpdate(x,y);
        simulationView.askUpdate(0,0);
        simulationView.updateCanvas();

        // data visualization
    }
}
