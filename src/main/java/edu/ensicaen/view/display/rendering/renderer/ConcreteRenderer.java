package edu.ensicaen.view.display.rendering.renderer;

import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.view.display.displayableComponents.CellView;
import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;
import edu.ensicaen.view.display.rendering.Canvas;

import javax.swing.*;

public class ConcreteRenderer implements Renderer {
    private final JFrame frame;
    private final JButton stepButton;
    private final Canvas canvas;
    private DisplayableComponent[][] displayableComponents;

    public ConcreteRenderer() {
        frame = new JFrame();
        stepButton = new JButton("Step");

        canvas = new Canvas();

        frame.add(canvas.getCanvasDisplay());
        frame.add(stepButton);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 900);

        initDummyDisplayableComponents();
    }

    private void initDummyDisplayableComponents() {
        // TODO remove
        CellView.CELL_SIZE = 800 / 10;

        displayableComponents = new DisplayableComponent[10][10];
        for (int i = 0; i < displayableComponents.length; i++) {
            for (int j = 0; j < displayableComponents[i].length; j++) {
                displayableComponents[i][j] = new CellView(i, j);
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
        for (DisplayableComponent[] displayableComponentRow : displayableComponents) {
            for (DisplayableComponent displayableComponent : displayableComponentRow) {
                renderDisplayableComponent(displayableComponent);
            }
        }
    }
    @Override
    public void renderDisplayableComponent(DisplayableComponent displayableComponent) {
        canvas.draw(displayableComponent);
    }
}
