package de.b4ckf1sh.configtool;

import javax.swing.*;
import java.awt.*;

public class SelectOption extends Option{

    private final String[] values;
    private final String[] descs;
    private final int defaultValue;



    public SelectOption(String name, String description, String[] values, String[] descs, int defaultValue) {
        super(name, description);

        this.values = values;
        this.descs = descs;
        this.defaultValue = defaultValue;

        super.cb = new JComboBox<>();

        for (int i = 0; i < values.length; i++) {
            ((JComboBox) cb).addItem(String.format("%s - %s", values[i], descs[i]));
            ((JComboBox) cb).setToolTipText(description);
            ((JComboBox) cb).setSelectedIndex(defaultValue);
        }
    }

    public Component getComponent() {
        return cb;
    }

    public void setValue(int value) {
        ((JComboBox) cb).setSelectedIndex(value);
    }

    public int getValue() {
        return ((JComboBox) cb).getSelectedIndex();
    }


}
