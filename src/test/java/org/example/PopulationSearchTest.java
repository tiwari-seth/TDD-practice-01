package org.example;

import org.example.exception_handler.exception;
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
        NullPointerException exc = Assertions.assertThrows(NullPointerException.class, () -> {
            int count = ps.getPopulation(city);
        });
        Assertions.assertEquals("Input is null",exc.getMessage());
    }
    @Test
    public void findPopulationWithInvalidInput(){
        String city = "XYZ";
        PopulationSearch ps = new PopulationSearch();

        int expectedPopulationCount=0;
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> {
            int count = ps.getPopulation(city);
        });
        Assertions.assertEquals("City doesn't exist in record",exception.getMessage());

    }
}
