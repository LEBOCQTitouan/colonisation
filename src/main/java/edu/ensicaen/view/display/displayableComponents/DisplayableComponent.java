package edu.ensicaen.view.display.displayableComponents;

import java.awt.*;

/**
 * Interface for all the components that can be displayed on the screen. This interface is used as a base for the
 * implementation of the decorator pattern.
 */
public interface DisplayableComponent {
    /**
     * Displays the component using the given graphics object.
     * @param g The graphics object to use for the display.
     */
    void display(Graphics g);
    /**
     * Returns the x coordinate of the component. Does not use getX() to avoid having to override default methods of
     * records.
     * @return x
     */
    int x();
    /**
     * Returns the y coordinate of the component. Does not use getY() to avoid having to override default methods of
     * records.
     * @return y
     */
    int y();
}
