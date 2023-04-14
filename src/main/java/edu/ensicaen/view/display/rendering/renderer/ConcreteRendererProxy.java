package edu.ensicaen.view.display.rendering.renderer;

import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;

import java.util.Stack;

public class ConcreteRendererProxy implements Renderer {
    private final ConcreteRenderer concreteRenderer;
    private final Stack<DisplayableComponent> updateQueue;
    private boolean hasDoneInitRendering = false;

    public ConcreteRendererProxy(ConcreteRenderer concreteRenderer) {
        this.concreteRenderer = concreteRenderer;
        updateQueue = new Stack<>();
    }

    @Override
    public void displayFrame() {
        concreteRenderer.displayFrame();
    }

    @Override
    public void setStepButtonAction(SimulationPresenter simulationPresenter) {
        concreteRenderer.setStepButtonAction(simulationPresenter);
    }

    @Override
    public void render() {
        if (!hasDoneInitRendering) {
            concreteRenderer.render();
            hasDoneInitRendering = true;
            return;
        }
        while (!updateQueue.empty()) {
            DisplayableComponent displayableComponent = updateQueue.pop();
            renderDisplayableComponent(displayableComponent);
        }
    }

    @Override
    public void renderDisplayableComponent(DisplayableComponent displayableComponent) {
        concreteRenderer.renderDisplayableComponent(displayableComponent);
    }
}
