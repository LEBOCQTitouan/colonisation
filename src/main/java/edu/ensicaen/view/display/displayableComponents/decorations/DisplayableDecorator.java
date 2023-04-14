package edu.ensicaen.view.display.displayableComponents.decorations;

import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

/**
 * Abstract class for all the decorators of the DisplayableComponent interface. This class implements the decorator
 * pattern and represents the base for any decoration.
 */
public abstract class DisplayableDecorator implements DisplayableComponent {
    /**
     * The component that is decorated.
     */
    protected DisplayableComponent wrappedComponent;

    public DisplayableDecorator(DisplayableComponent wrappedComponent) {
        this.wrappedComponent = wrappedComponent;
    }

    @Override
    public int x() {
        return wrappedComponent.x();
    }

    @Override
    public int y() {
        return wrappedComponent.y();
    }
}
