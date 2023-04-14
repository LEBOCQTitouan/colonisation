package edu.ensicaen.view.display.displayableComponents.decorations;

import edu.ensicaen.view.display.displayableComponents.CellView;
import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

import java.awt.*;

public class ShockwaveView extends DisplayableDecorator {
    public ShockwaveView(DisplayableComponent wrappedComponent) {
        super(wrappedComponent);
    }

    @Override
    public void display(Graphics g) {
        wrappedComponent.display(g);
        g.setColor(new Color(0, 255, 255, 128)); // 50% transparent cyan
        g.fillRect(getX() * CellView.CELL_SIZE, getY() * CellView.CELL_SIZE, 10, 10);
    }
}
