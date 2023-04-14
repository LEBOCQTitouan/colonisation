package edu.ensicaen.view.display.displayableComponents;

import java.awt.*;

/**
 * A cell view is a displayable component that represents a cell. It is a square of size CELL_SIZE. It is the base
 * component of the decorator pattern initiated by @DisplayableComponent and holds positional information.
 */
public record CellView(int x, int y) implements DisplayableComponent {
    /**
     * The size of a cell in pixels.
     * TODO remove this static field and use a parameter or a class instead.
     */
    public static int CELL_SIZE = 10;

    @Override
    public void display(Graphics g) {

        int computedX = x * CELL_SIZE;
        int computedY = y * CELL_SIZE;

        g.setColor(Color.GREEN);
        g.fillRect(computedX, computedY, CELL_SIZE, CELL_SIZE);
        g.setColor(Color.GRAY);
        g.drawRect(computedX, computedY, CELL_SIZE, CELL_SIZE);
    }
}
