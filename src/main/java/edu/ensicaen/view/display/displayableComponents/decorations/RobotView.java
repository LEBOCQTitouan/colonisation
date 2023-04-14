package edu.ensicaen.view.display.displayableComponents.decorations;

import edu.ensicaen.view.display.displayableComponents.CellView;
import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

import java.awt.*;

public class RobotView extends DisplayableDecorator {
    public RobotView(DisplayableComponent wrappedComponent) {
        super(wrappedComponent);
    }

    @Override
    public void display(Graphics g) {
        wrappedComponent.display(g);
        g.setColor(Color.RED);
        g.fillOval(x() * CellView.CELL_SIZE, y() * CellView.CELL_SIZE, 10, 10);
    }
}
