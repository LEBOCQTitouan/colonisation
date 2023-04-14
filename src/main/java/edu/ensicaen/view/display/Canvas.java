package edu.ensicaen.view.display;

import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

import javax.swing.*;

public class Canvas {
    private final JPanel canvasDisplay;

    public Canvas() {
        canvasDisplay = new JPanel();
        canvasDisplay.setSize(800, 800);
        canvasDisplay.setBackground(java.awt.Color.RED);
    }

    public JPanel getCanvasDisplay() {
        return canvasDisplay;
    }

    public void draw(DisplayableComponent displayableComponent) {
        displayableComponent.display(canvasDisplay.getGraphics());
    }
}
