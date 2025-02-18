package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PopulationSearchTest {



    @Test
    public void findPopulation(){
        String city = "Hyderabad";
        PopulationSearch ps = new PopulationSearch();
        int count = ps.getPopulation(city);
        int expectedPopulationCount=500000;
        Assertions.assertEquals(expectedPopulationCount,count);
    }
    @Test
    public void findPopulationWithEmptyInput(){
        String city = "";
        PopulationSearch ps = new PopulationSearch();

        int expectedPopulationCount=0;
//        Assertions.assertEquals(expectedPopulationCount,count);
        Assertions.assertThrows(NullPointerException.class,() -> {
            int count = ps.getPopulation(city);
        });
    }
}
