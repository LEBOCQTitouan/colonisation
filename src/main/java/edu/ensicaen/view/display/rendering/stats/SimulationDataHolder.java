package edu.ensicaen.view.display.rendering.stats;

import edu.ensicaen.presenter.dataHandling.DataContainer;

import javax.swing.*;
import java.awt.*;

/**
 * This class is used to display the simulation data and information.
 */
public class SimulationDataHolder extends JPanel {
    private final DataHolder nbOfIterations;

    public SimulationDataHolder(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
        this.setLayout(new GridBagLayout());

        this.nbOfIterations = new DataHolder("Nb of iterations", 0);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(nbOfIterations, constraints);
    }

    public SimulationDataHolder(LayoutManager layout) {
        super(layout);
        this.setLayout(new GridBagLayout());

        this.nbOfIterations = new DataHolder("Nb of iterations", 0);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(nbOfIterations, constraints);
    }

    public SimulationDataHolder(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
        this.setLayout(new GridBagLayout());

        this.nbOfIterations = new DataHolder("Nb of iterations", 0);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(nbOfIterations, constraints);
    }

    public SimulationDataHolder() {
        this.setLayout(new GridBagLayout());

        this.nbOfIterations = new DataHolder("Nb of iterations", 0);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(nbOfIterations, constraints);
    }

    /**
     * This method is used to update the data displayed by the simulation data holder.
     * @param dataContainer The data container that contains the data to be displayed.
     */
    public void handleDataContainer(DataContainer dataContainer) {
        this.nbOfIterations.setValue(dataContainer.getNumberOfIterations());
    }
}
