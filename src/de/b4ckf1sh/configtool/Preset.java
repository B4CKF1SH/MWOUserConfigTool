package de.b4ckf1sh.configtool;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class Preset {
    public static HashMap<String, Integer> presetFromJson(String json) throws JsonProcessingException {
        return new ObjectMapper().readValue(json, HashMap.class);
    }
    public static String jsonFromPreset(HashMap<String, Integer> preset) throws JsonProcessingException {
        return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(preset);
    }
}
