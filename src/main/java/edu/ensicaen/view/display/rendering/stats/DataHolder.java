package edu.ensicaen.view.display.rendering.stats;

import javax.swing.*;

public class DataHolder extends JLabel {
    private final String name;
    private int value;

    public DataHolder(String name, int value) {
        this.name = name;
        this.value = value;
        this.setText(name + " : " + value);
    }

    public void setValue(int value) {
        this.value = value;
        this.setText(name + " : " + value);
    }

    public int getValue() {
        return value;
    }
}
