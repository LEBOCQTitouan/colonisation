package edu.ensicaen.view.display.rendering.stats;

import javax.swing.*;
import java.awt.*;

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
}
