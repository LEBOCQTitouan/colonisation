package edu.ensicaen.view.display.rendering;

import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * This class is used to display @DisplayableComponent in a Jswing environment. It extends the JPanel class and can be
 * used as such.
 */
public class Canvas extends JPanel {
    /**
     * This lock is used to prevent concurrent access to the displayableComponents list.
     */
    private final Semaphore displayableComponentsLock = new Semaphore(1);
    /**
     * This list contains all the displayable components that will be displayed on the canvas.
     * TODO : replace this list with a more efficient data structure or implement the suppression of duplicate displayable components.
     */
    private final List<DisplayableComponent> displayableComponents;

    public Canvas() {
        this.displayableComponents = new ArrayList<>();
    }

    @Override
    public void paintComponent(Graphics g) {
        while (!displayableComponentsLock.tryAcquire());
        super.paintComponent(g);
        for (DisplayableComponent displayableComponent : displayableComponents) {
            displayableComponent.display(g);
        }
        displayableComponentsLock.release();
    }

    /**
     * Add a displayable component to the canvas.
     * @param displayableComponent the displayable component to add.
     */
    public void addDisplayableComponent(DisplayableComponent displayableComponent) {
        while (!displayableComponentsLock.tryAcquire());

        // delete duplicate displayable components
        for (int i = 0; i < displayableComponents.size(); i++) {
            DisplayableComponent component = displayableComponents.get(i);
            if (component.x() == displayableComponent.x() && component.y() == displayableComponent.y()) {
                displayableComponents.remove(i);
                break;
            }
        }

        displayableComponents.add(displayableComponent);
        displayableComponentsLock.release();
    }
}
