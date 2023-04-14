package edu.ensicaen.view.display.displayableComponents;

import java.awt.*;

public class CellView implements DisplayableComponent {
    public static int CELL_SIZE = 10;
    private final int x;
    private final int y;

    public CellView(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
