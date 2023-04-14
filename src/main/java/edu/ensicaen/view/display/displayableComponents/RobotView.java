package edu.ensicaen.view.display.displayableComponents;

import java.awt.*;

public class RobotView extends DisplayableDecorator {
    public RobotView(DisplayableComponent wrappedComponent) {
        super(wrappedComponent);
    }

    @Override
    public void display(Graphics g) {
        wrappedComponent.display(g);
        g.setColor(Color.RED);
        g.fillOval(getX() * CellView.CELL_SIZE, getY() * CellView.CELL_SIZE, 10, 10);
    }
}
