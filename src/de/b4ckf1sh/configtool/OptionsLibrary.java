package de.b4ckf1sh.configtool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionsLibrary {

    private OptionsLibrary() {}

    private static List<Option> optionList = new ArrayList<>();
    private static List<Preset> presetList = new ArrayList<>();

    static {
        optionList.addAll(Arrays.asList(
                new SelectOption("q_ShaderSky", "Sky Rendering Quality", new String[]{"0", "1", "1"}, new String[]{"Low", "Medium", "High"}, 0),
                new SelectOption("q_ShaderVegetation", "Vegetation Rendering Quality", new String[]{"0", "1", "2"}, new String[]{"Low", "Medium", "High"}, 0),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false),
                new RangeOption("q_ShaderVegetation", "Vegetation Rendering Quality", 0, 10, 5, 5, false)
        ));
    }

    static {

    }

    public static List<Option> getOptionList() {
        return List.copyOf(optionList);
    }

    public static List<Preset> getPresetList() {
        return List.copyOf(presetList);
    }
}
