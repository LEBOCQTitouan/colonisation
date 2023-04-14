package edu.ensicaen.view.display.displayableComponents;

import java.awt.*;

public record CellView(int x, int y) implements DisplayableComponent {
    public static int CELL_SIZE = 1;

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
