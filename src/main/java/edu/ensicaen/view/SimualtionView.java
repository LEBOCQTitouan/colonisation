package edu.ensicaen.view;

import edu.ensicaen.presenter.SimulationPresenter;
import edu.ensicaen.view.display.Renderer;
import edu.ensicaen.view.display.displayableComponents.CellView;
import edu.ensicaen.view.display.displayableComponents.DisplayableComponent;
import edu.ensicaen.view.display.displayableComponents.RobotView;
import edu.ensicaen.view.display.displayableComponents.ShockwaveView;

import java.util.ArrayList;
import java.util.List;

public class SimualtionView {
    private SimulationPresenter simulationPresenter;
    private final Renderer renderer;

    public SimualtionView() {
        renderer = new Renderer();
    }

    public void setSimulationPresenter(SimulationPresenter simulationPresenter) {
        this.simulationPresenter = simulationPresenter;
        renderer.setStepButtonAction(simulationPresenter);
    }

    public void askModelStep(int n) {
        if (simulationPresenter != null) {
            simulationPresenter.makeStep(n);
        }
    }

    public void askUpdate(int x, int y) {
        List<DisplayableComponent> displayableComponents = new ArrayList<>();
        displayableComponents.add(new CellView(0, 1));
        displayableComponents.add(new CellView(1, 1));

        DisplayableComponent cellViewRobot = new CellView(2, 1);
        cellViewRobot = new RobotView(cellViewRobot);
        displayableComponents.add(cellViewRobot);

        DisplayableComponent cellViewShockwave = new CellView(3, 1);
        cellViewShockwave = new ShockwaveView(cellViewShockwave);
        displayableComponents.add(cellViewShockwave);

        DisplayableComponent cellViewRobotAndShockwave = new CellView(4, 1);
        cellViewRobotAndShockwave = new ShockwaveView(cellViewRobotAndShockwave);
        cellViewRobotAndShockwave = new RobotView(cellViewRobotAndShockwave);
        displayableComponents.add(cellViewRobotAndShockwave);

        renderer.render(displayableComponents);
    }

    public void displayGUI() {
        renderer.display();
    }
}
