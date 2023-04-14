package edu.ensicaen.model;

import edu.ensicaen.model.entities.EntitiesMediator;
import edu.ensicaen.presenter.SimulationPresenter;

public class Sequencer {
    private SimulationPresenter simulationPresenter;
    private final EntitiesMediator entitiesMediator;

    public Sequencer() {
        entitiesMediator = new EntitiesMediator();
    }

    public void step() {
        // TODO

    }

    public EntitiesMediator getEntitiesMediator() {
        return entitiesMediator;
    }

    public void setSimulationPresenter(SimulationPresenter simulationPresenter) {
        this.simulationPresenter = simulationPresenter;
    }
}
