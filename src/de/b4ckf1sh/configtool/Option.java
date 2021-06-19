package de.b4ckf1sh.configtool;

import javax.swing.*;
import java.awt.*;

public abstract class Option {
    public final String name;
    public final String description;

    protected Component cb;

    public Option(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Component getComponent() {
        return cb;
    }

    abstract void setValue(int value);
    abstract int getValue();
}
