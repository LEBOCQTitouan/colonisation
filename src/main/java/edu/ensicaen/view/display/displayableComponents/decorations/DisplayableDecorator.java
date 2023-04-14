package edu.ensicaen.view.display.displayableComponents.decorations;

import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

public abstract class DisplayableDecorator implements DisplayableComponent {
    protected DisplayableComponent wrappedComponent;

    public DisplayableDecorator(DisplayableComponent wrappedComponent) {
        this.wrappedComponent = wrappedComponent;
    }

    @Override
    public int getX() {
        return wrappedComponent.getX();
    }

    @Override
    public int getY() {
        return wrappedComponent.getY();
    }
}
