package edu.ensicaen.view.display;

import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

import javax.swing.*;
import java.util.List;

public class Renderer {
    private final JFrame frame;
    private final JButton stepButton;
    private final Canvas canvas;

    public Renderer() {
        frame = new JFrame();
        stepButton = new JButton("Step");

        canvas = new Canvas();

        frame.add(canvas.getCanvasDisplay());
        frame.add(stepButton);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 900);
    }

    public void display() {
        frame.setVisible(true);
    }

    public void setStepButtonAction(SimulationPresenter simulationPresenter) {
        stepButton.addActionListener(
                e -> simulationPresenter.makeStep(1)
        );
    }

    public void render(List<DisplayableComponent> displayableComponents) {
        for (DisplayableComponent displayableComponent : displayableComponents) {
            canvas.draw(displayableComponent);
        }
    }
}
