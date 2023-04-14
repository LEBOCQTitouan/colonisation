package edu.ensicaen.view.display.displayableComponents;

import java.awt.*;

public interface DisplayableComponent {
    void display(Graphics g);
    int getX();
    int getY();
}