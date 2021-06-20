package de.b4ckf1sh.configtool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionsLibrary {

    private OptionsLibrary() {}

    private static List<Option> optionList = new ArrayList<>();

    static {
        optionList.addAll(Arrays.asList(
                new SelectOption("q_ShaderSky", "Sky Rendering Quality", new String[]{"0", "1", "1"}, new String[]{"Low", "Medium", "High"}, 0),
                new SelectOption("q_ShaderVegetation", "Vegetation Rendering Quality", new String[]{"0", "1", "2"}, new String[]{"Low", "Medium", "High"}, 0),
                new RangeOption("q_Test1", "Vegetation Rendering Quality", 0, 10, 5, 2, false),
                new RangeOption("q_Test2", "Vegetation Rendering Quality", 0, 10, 5, 2, true)

        ));
    }

    public static List<Option> getOptionList() {
        return List.copyOf(optionList);
    }
}
