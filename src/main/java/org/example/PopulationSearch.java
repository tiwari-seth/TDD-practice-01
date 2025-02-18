package org.example;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {
    public int getPopulation(String city) {
        return getPopulationStatistic().get(city);
    }
    private Map<String, Integer> getPopulationStatistic() {
        Map<String, Integer> populationMap = new HashMap<>();
        populationMap.put("Bangalore", 200000);
        populationMap.put("Hyderabad", 500000);
        populationMap.put("Pune", 300000);
        populationMap.put("Mumbai", 800000);
        return populationMap;
    }
}
