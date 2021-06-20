package de.b4ckf1sh.configtool;

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

public class RangeOption extends Option {


    private final int defaultValue;
    private final int maxValue;
    private final int minValue;
    private final int stepSize;
    private final boolean isDouble;

    public RangeOption(String name, String description, int minValue, int maxValue, int defaultValue, int stepSize, boolean isDouble) {
        super(name, description);

        this.minValue = minValue;
        this.maxValue = maxValue;
        this.defaultValue = defaultValue;
        this.stepSize = stepSize;
        this.isDouble = isDouble;

        super.cb = new JSlider(minValue, maxValue);
        ((JSlider) cb).setMajorTickSpacing(stepSize);
        ((JSlider) cb).setPaintTicks(false);
        ((JSlider) cb).setValue(defaultValue);
        ((JSlider) cb).setPaintLabels(true);
        ((JSlider) cb).setSnapToTicks(true);
        cb.setSize(100, 40);
        cb.setPreferredSize(new Dimension(100, 40));
        cb.revalidate();



    }

    public Component getComponent() {
        return cb;
    }


    public void setValue(int value) {
        ((JSlider) cb).setValue(value);
    }

    public int getValue() {
        return ((JSlider) cb).getValue();
    }

    public boolean getIsDouble() {
        return isDouble;
    }
}
