package edu.ensicaen.view.display.rendering;

import edu.ensicaen.view.display.displayableComponents.CellView;
import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Canvas extends JPanel {
    private final Semaphore displayableComponentsLock = new Semaphore(1);
    private final List<DisplayableComponent> displayableComponents;

    public Canvas() {
        this.displayableComponents = new ArrayList<>();
    }

    @Override
    public void paintComponent(Graphics g) {
        CellView.CELL_SIZE = Math.min(getWidth(), getHeight()) / 10;
        while (!displayableComponentsLock.tryAcquire());
        super.paintComponent(g);
        for (DisplayableComponent displayableComponent : displayableComponents) {
            displayableComponent.display(g);
        }
        displayableComponentsLock.release();
    }

    public void addDisplayableComponent(DisplayableComponent displayableComponent) {
        while (!displayableComponentsLock.tryAcquire());
        displayableComponents.add(displayableComponent);
        displayableComponentsLock.release();
    }
}
