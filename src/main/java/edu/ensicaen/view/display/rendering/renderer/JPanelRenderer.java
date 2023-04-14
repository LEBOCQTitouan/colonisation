package edu.ensicaen.view.display.rendering.renderer;

import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.view.display.displayableComponents.CellView;
import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;
import edu.ensicaen.view.display.rendering.Canvas;

import javax.swing.*;
import java.awt.*;

public class JPanelRenderer implements Renderer {
    private final JFrame frame;
    private final JButton stepButton;
    private final Canvas canvas;

    public JPanelRenderer() {
        frame = new JFrame();
        frame.setTitle("Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        frame.setLayout(layout);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(800, 800));
        canvas.setBackground(Color.RED);
        stepButton = new JButton("Step");
        stepButton.setPreferredSize(new Dimension(800, 30));

        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.add(canvas, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        frame.add(stepButton, constraints);

        frame.pack();

        initDummyDisplayableComponents();
    }

    private void initDummyDisplayableComponents() {
        // TODO remove
        CellView.CELL_SIZE = 80;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                canvas.addDisplayableComponent(new CellView(i, j));
            }
        }
    }
    @Override
    public void displayFrame() {
        frame.setVisible(true);
    }
    @Override
    public void setStepButtonAction(SimulationPresenter simulationPresenter) {
        stepButton.addActionListener(
                e -> simulationPresenter.makeStep(1)
        );
    }
    @Override
    public void render() {
        canvas.repaint();
    }
    @Override
    public void renderDisplayableComponent(DisplayableComponent displayableComponent) {
        canvas.addDisplayableComponent(displayableComponent);
    }
}
